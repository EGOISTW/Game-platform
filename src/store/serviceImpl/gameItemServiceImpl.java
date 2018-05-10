package store.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import store.mapper.GameinfoMapper;
import store.mapper.GameinfoPhotoMapper;
import store.mapper.GcarMapper;
import store.pojo.Gameinfo;
import store.pojo.GameinfoExample;
import store.pojo.GameinfoPhoto;
import store.pojo.Gcar;
import store.pojo.GcarExample;
import store.pojo.infoAndPhoto;
import store.service.gameItemService;
@Service
public class gameItemServiceImpl implements gameItemService {
	@Autowired
	private GameinfoMapper infomapper;
	@Autowired
	private GameinfoPhotoMapper infoPhotoMapper;
	@Autowired
	private GcarMapper gcarmapper;

	@Override
	public List<Gameinfo> queryItemByName(String gname) {
		GameinfoExample example=new GameinfoExample();
		GameinfoExample.Criteria criteria=example.createCriteria();
		criteria.andGNameLike("%"+gname+"%");
		List<Gameinfo> list=infomapper.selectByExample(example);
		return list;
	}

	

	@Override
	public infoAndPhoto queryItemAndPhotoById(Integer gId) {
		
		return infoPhotoMapper.queryGameInfoAndPhoto(gId);
	}



	@Override
	public void insertGame(Gameinfo info) {
		info.setgStatus(0);
		if(info.getgPhoto()==null || info.getgPhoto().equals("")) {
			info.setgPhoto("\\images\\NoPhoto.jpg");
		}
		infomapper.insert(info);
		
		
	}



	@Override
	public void updataGame(Gameinfo info) {
		infomapper.updateByPrimaryKey(info);
		
	}



	@Override
	public void delGame(Integer gId) {
		infomapper.deleteByPrimaryKey(gId);
		
	}



	@Override
	public void insertCar(Gcar car) {
		
		gcarmapper.insert(car);
		
	}



	@Override
	public List<Gcar> queryCarByid(int userId) {
		GcarExample example=new GcarExample();
		GcarExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		List<Gcar> list=gcarmapper.selectByExample(example);
		return list;
	}



	@Override
	public void delCarById(int gameId, int userId) {
		GcarExample example=new GcarExample();
		GcarExample.Criteria criteria=example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andGameIdEqualTo(gameId);
		
		gcarmapper.deleteByExample(example);
		
		
		
		// TODO Auto-generated method stub
		
	}

}
