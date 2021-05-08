package ab_ecommerce.business.concretes;

import java.util.List;

import ab_ecommerce.business.abstracts.UserService;
import ab_ecommerce.dataAccess.abstracts.UserDao;
import ab_ecommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	public UserManager(UserDao userDao)
	{
		this.userDao=userDao;
	}

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
		return userDao.getById(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
	
	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public User getByEmailandPassWord(String email, String passWord) {
		User user=userDao.getByEmailandPassWord(email, passWord);
		System.out.println(user.getEmail()+" password"+user.getPassWord());
		return user;
	}
}
