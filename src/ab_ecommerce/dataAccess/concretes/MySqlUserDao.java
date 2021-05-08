package ab_ecommerce.dataAccess.concretes;

import java.util.List;

import ab_ecommerce.dataAccess.abstracts.UserDao;
import ab_ecommerce.entities.concretes.User;

public class MySqlUserDao implements UserDao{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User getByEmailandPassWord(String email, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
