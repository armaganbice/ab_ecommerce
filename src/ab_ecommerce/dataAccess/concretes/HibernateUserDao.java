package ab_ecommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ab_ecommerce.dataAccess.abstracts.UserDao;
import ab_ecommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

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
		User user=new User("Armaðan","Bice","123456","armaganbice@hotmail.com");
		return user;
	}

	@Override
	public List<User> getAll() {
		User user=new User("Armaðan","Bice","123456","armaganbice@hotmail.com");
        List<User> users=new ArrayList<User>();
        users.add(user);
		return users;
	}
	
	@Override
	public User getByEmail(String email) {
		User user=new User("Armaðan","Bice","123456","armaganbice@hotmail.com");
		return user;
	}

	@Override
	public User getByEmailandPassWord(String email, String passWord) {
		User user=new User("Armaðan","Bice","123456","armaganbice@hotmail.com");
		user.setRegistered(true);
		return user;
	}

	

}
