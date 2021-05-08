package ab_ecommerce.GoogleAuth;

import ab_ecommerce.business.abstracts.UserAuthService;
import ab_ecommerce.business.abstracts.UserService;
import ab_ecommerce.business.abstracts.UserValidationService;
import ab_ecommerce.entities.concretes.User;

public class GoogleAuthManager implements UserAuthService {

	
    private String _vCode="ab123456";
	
	private UserService userService;
	private UserValidationService userValidationService;
	
	public GoogleAuthManager()
	{
		
	}
	
	public GoogleAuthManager(UserService userService,UserValidationService userValidationService)
	{
		this.userService=userService;
		this.userValidationService=userValidationService;
	}
	
	@Override
	public boolean Login(String email, String passWord) {
        System.out.println("Google Account is successfully login");
		return true;
	}

	@Override
	public boolean Register(User user) {
        System.out.println("Google Account is successfully registered");
		return true;
	}

	@Override
	public void SendRegisterEmail(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean RegisterEmail(int id, String vCode) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void SendEmail(User user, String message) {
		System.out.println("Send email user "+user.getFirstName());
		System.out.println("Message:  "+message);
	}

}
