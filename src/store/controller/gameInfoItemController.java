package store.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import store.pojo.Gameinfo;
import store.pojo.GameinfoPhoto;
import store.pojo.Gcar;
import store.pojo.infoAndPhoto;
import store.service.gameItemService;

@Controller
@RequestMapping("/item")
public class gameInfoItemController {
	public static final int PAGESIZE=10;
	@Autowired
	private gameItemService itemService;
	@RequestMapping("/findGame")
	public ModelAndView FindGameByName(@RequestParam(value="pageNo",defaultValue="1",required=false) int pageNo,String gName) throws UnsupportedEncodingException {
		ModelAndView mvAndView=new ModelAndView();
		PageHelper.startPage(pageNo,PAGESIZE);
		String str = new String(gName.getBytes("iso-8859-1"),"UTF-8");
		List<Gameinfo> list=itemService.queryItemByName(str);
		
		mvAndView.addObject("gName", str);
		mvAndView.addObject("infoList",list);
		mvAndView.setViewName("search");
		PageInfo pageInfo=new PageInfo<>(list);
		mvAndView.addObject("pageInfo",pageInfo);
		return mvAndView;
		
	}
	@RequestMapping("/findGameByPk")
	public ModelAndView FindGameByPk(int gId) {
		ModelAndView mvAndView=new ModelAndView();
		infoAndPhoto infoPhoto=itemService.queryItemAndPhotoById(gId);
		mvAndView.addObject("infoPhoto", infoPhoto);
		mvAndView.setViewName("Detail");
		
		return mvAndView;
		
	}
	@RequestMapping("/addGame")
	public String addGameItem(Gameinfo info) {
	
		itemService.insertGame(info);
		
		return "redirect:/item/findGame?pageNo=1&gName=";
		
		
		
	}
	
	@RequestMapping("/findGameByPkToUpdata")
	public ModelAndView FindGameByPkToUpdata(int gId) {
		ModelAndView mvAndView=new ModelAndView();
		infoAndPhoto infoPhoto=itemService.queryItemAndPhotoById(gId);
		mvAndView.addObject("infoPhoto", infoPhoto);
		mvAndView.setViewName("updataItem");
		
		return mvAndView;
		
	}
	@RequestMapping("/updataGameItem")
	public String updataGameItem(Gameinfo info) {
		itemService.updataGame(info);
		return "redirect:/item/findGame?pageNo=1&gName=";
		
	}
	@RequestMapping("/delGameItem")
	public String delGameItem(int gId) {
		itemService.delGame(gId);
		
		
		return "redirect:/item/findGame?pageNo=1&gName=";
		
	}
	@RequestMapping("/addToCar")
	public String addToCar(Gameinfo info,int userId) {
		
		Gcar car=new Gcar();
		car.setcGamephoto(info.getgPhoto());
		car.setGameId(info.getgId());
		car.setGameName(info.getgName());
		car.setcTime(new Date());
		car.setcPrice(info.getgPrice());
		car.setUserId(userId);
		
		
		
		
		
		
		
		itemService.insertCar(car);
		
		
		

		
		
		
		return "redirect:/item/findCar?userId="+userId;
		
	}
	@RequestMapping("/findCar")
	public ModelAndView findCar(int userId) {
		int sum=0;
		
		List<Gcar> list=itemService.queryCarByid(userId);
		
		ModelAndView mvAndView=new ModelAndView();

		for(Gcar car:list) {
			sum+=car.getcPrice();
		}
		
		mvAndView.addObject("total",sum);
		mvAndView.addObject("carList",list);
		mvAndView.setViewName("car");
		



		return mvAndView;
		
		
		
		
		

		
	}
	@RequestMapping("/delcarItem")
	public String delCarItem(int gameId,int userId) {
		itemService.delCarById(gameId, userId);
		
		
		return "redirect:/item/findCar?userId="+userId;
		
	}

}
