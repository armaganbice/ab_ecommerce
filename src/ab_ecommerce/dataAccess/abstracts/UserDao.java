package ab_ecommerce.dataAccess.abstracts;

import java.util.List;

import ab_ecommerce.entities.concretes.User;

public interface UserDao {
	
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public User getById(int id);
	public List<User> getAll();
	public User getByEmail(String email);
	public User getByEmailandPassWord(String email,String passWord);
	
}
