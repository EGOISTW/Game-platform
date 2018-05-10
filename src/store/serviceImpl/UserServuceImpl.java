package store.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import store.mapper.GameuserMapper;
import store.pojo.Gameuser;
import store.pojo.GameuserExample;
import store.service.UserService;
@Service
public class UserServuceImpl implements UserService {
	@Autowired
	private GameuserMapper usermapper;

	@Override
	public Gameuser LoginUser(String username, String password) {
		GameuserExample example=new GameuserExample();
		GameuserExample.Criteria criteria=example.createCriteria();
		
		criteria.andUserNameEqualTo(username);
		criteria.andGamePasswordEqualTo(password);
		
		List<Gameuser> list=usermapper.selectByExample(example);
		
		if(list!=null && list.size()>0) {
			return list.get(0);
			
		}
		return null;
		
		
		
		
		
	}

	@Override
	public void addUser(Gameuser user) {
		// TODO Auto-generated method stub
		user.setCreationDate(new Date());
		user.setGroupId(1);
		usermapper.insert(user);
		
	}

	@Override
	public boolean findUserName(String userName) {
		GameuserExample example=new GameuserExample();
		GameuserExample.Criteria criteria=example.createCriteria();
		criteria.andUserNameEqualTo(userName);
		if(usermapper.selectByExample(example).size()>0) {
			return true;
			
		}else {
			return false;
		}
		
	}

	

}
