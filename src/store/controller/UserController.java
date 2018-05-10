package store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import store.pojo.Gameuser;
import store.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public ModelAndView loginUser(String username,String password,HttpServletRequest request) {
		ModelAndView mView=new ModelAndView();
		Gameuser uGameuser=userService.LoginUser(username, password);
		if (uGameuser!=null) {
			request.getSession().setAttribute("loginUser",uGameuser.getRealName());
			request.getSession().setAttribute("UserGroup",uGameuser.getGroupId());
			request.getSession().setAttribute("userId",uGameuser.getUserId());
			System.out.println("1"+request.getSession().getAttribute("loginUser"));
			System.out.println("1"+request.getSession().getAttribute("UserGroup"));
			mView.setViewName("index");
			return mView;
			
		}else {
			mView.addObject("errorMsg", "用户名或密码错误");
			mView.setViewName("login");
			return mView;
			
		}
		
		
		
		
	}
	@RequestMapping("/register")
	public String registUser(Model model,@Validated Gameuser gameuser,BindingResult result) {
		if(userService.findUserName(gameuser.getUserName())==true) {
			model.addAttribute("echo", "此用户名已存在");
			if (result.hasErrors()) {
				
				List<FieldError> errorList=result.getFieldErrors();
				for(FieldError error : errorList) {
					model.addAttribute(error.getField(), error.getDefaultMessage());
					
				}
				
			}
			return "reg";
			
		}
		else if (result.hasErrors()) {
			
			List<FieldError> errorList=result.getFieldErrors();
			for(FieldError error : errorList) {
				model.addAttribute(error.getField(), error.getDefaultMessage());
				
			}
			return "reg";
			
			
		}else {
		
		userService.addUser(gameuser);
		return "login";
		}
		
	}
//	注销
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session) {
		
		session.invalidate();
		return "login";
	}
	
	
	

}
