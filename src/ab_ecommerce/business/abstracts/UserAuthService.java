package ab_ecommerce.business.abstracts;

import ab_ecommerce.entities.concretes.User;

public interface UserAuthService {
	
	public boolean Login(String email,String passWord);
	
	public boolean Register(User user);
	
	public void SendRegisterEmail(User user);
	
	public boolean RegisterEmail(int id,String vCode);
	
	public void SendEmail(User user,String message);
}
