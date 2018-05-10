package store.service;

import java.util.List;

import store.pojo.Gameinfo;
import store.pojo.Gcar;
import store.pojo.infoAndPhoto;

public interface gameItemService {
	public List<Gameinfo> queryItemByName(String gname);
	public infoAndPhoto queryItemAndPhotoById(Integer gId);
	public void insertGame(Gameinfo info);
	public void updataGame(Gameinfo info);
	public void delGame(Integer gId);
	public void insertCar(Gcar car);
	public List<Gcar> queryCarByid(int userId);
	public void delCarById(int gameId,int userId);
}
