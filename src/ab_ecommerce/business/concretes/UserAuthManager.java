package ab_ecommerce.business.concretes;

import ab_ecommerce.business.abstracts.UserAuthService;
import ab_ecommerce.business.abstracts.UserService;
import ab_ecommerce.business.abstracts.UserValidationService;
import ab_ecommerce.entities.concretes.User;

public class UserAuthManager implements UserAuthService {

	private String _vCode="ab123456";
	
	private UserService userService;
	private UserValidationService userValidationService;
	public UserAuthManager(UserService userService,UserValidationService userValidationService)
	{
		this.userService=userService;
		this.userValidationService=userValidationService;
	}
	
	@Override
	public boolean Login(String email,String passWord) {
		User user=userService.getByEmailandPassWord(email, passWord);
		if (user != null && user.isRegistered())
		{
			SendEmail(user,"You are login successfully");
			return true;
		}
		else
		{
			if (user != null)
			{
			   SendEmail(user," You are not login.");
			}
			return false;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public boolean Register(User user) {
		if (userValidationService.validate(user))
		{
			SendRegisterEmail(user);
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void SendRegisterEmail(User user) {
		//String vCode="ab123456"; 
		// todo: this vCode must generated random and record to
		// a database table for all users 
		// - get id (userid) to access this value 
		SendEmail(user,user.getFirstName()+" register email please register to \n link to :http/www.ab_ecommerce.com/register/vCode="+_vCode+"&id="+user.getId());
	}

	@Override
	public boolean RegisterEmail(int id,String vCode) {
		// todo: if User Tables from database
		User registeredUser=userService.getById(id);
		//User registeredUser=new User();
		if (vCode==_vCode)
		{
	    	System.out.println("User registered with email vCode="+vCode);
    		SendEmail(registeredUser,"Your are registered this vCode="+vCode);
	    	return true;
		}
		else
		{
	    	System.out.println("User is not registered with email vCode="+vCode);
    		SendEmail(registeredUser,"Your are not registered this vCode="+vCode);
	    	return false;
		}
	}

	public void SendEmail(User user,String message)
	{
		System.out.println("Send email user "+user.getFirstName());
		System.out.println("Message:  "+message);
	}
	
	
}
