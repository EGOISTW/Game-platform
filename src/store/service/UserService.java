package store.service;



import store.pojo.Gameuser;

public interface UserService {
	public Gameuser LoginUser(String username,String password);
	
	public void addUser(Gameuser user);
	
	public boolean findUserName(String userName);

}
