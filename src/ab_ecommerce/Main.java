package ab_ecommerce;

import ab_ecommerce.GoogleAuth.GoogleAuthManager;
import ab_ecommerce.business.abstracts.UserAuthService;
import ab_ecommerce.business.abstracts.UserService;
import ab_ecommerce.business.abstracts.UserValidationService;
import ab_ecommerce.business.concretes.UserAuthManager;
import ab_ecommerce.business.concretes.UserManager;
import ab_ecommerce.business.concretes.UserValidationManager;
import ab_ecommerce.dataAccess.abstracts.UserDao;
import ab_ecommerce.dataAccess.concretes.HibernateUserDao;
import ab_ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// Warning all data items from fake data 
		System.out.println("User Management Test - kodlamaio_ab_ecommerce  ");
		System.out.println("-- kodlamaio homework 8.05.2021 Armaðan Bice --");
		User user=new User("Armaðan","Bice","123456","armaganbice@hotmail.com");
		UserDao userDao=new HibernateUserDao();
		UserService userService=new UserManager(userDao);
		UserValidationService userValidationService=new UserValidationManager(userService);
	    UserAuthService userAuthService=new UserAuthManager(userService,userValidationService);
	    System.out.println("----------------------------");
	    if (userAuthService.Register(user))
		{
			System.out.println("User registration first step successfull");
		}
		else
		{
			System.out.println("User registration  error");
		}
		System.out.println("----------------------------");
		if ( userAuthService.RegisterEmail(0,"deneme") ) 
		{
		  System.out.println("User registration successfull");
	    } 
		else 
		{
		  System.out.println("User registration is not ok"); 
		} 
		System.out.println("----------------------------");
		if ( userAuthService.RegisterEmail(0,"ab123456") ) 
		{
		  System.out.println("User registration successfull");
	    } 
		else 
		{
		  System.out.println("User registration is not ok"); 
		} 
		System.out.println("----------------------------");
		if ( userAuthService.Login("armaganbice@hotmail.com", "123456"))
		{
			System.out.println("User login successfull");
		}
		else
		{
			System.out.println("User login is not ok");
		}
		
		System.out.println("GOOGLE User Auth Service (Fake) Test");
	    UserAuthService googleAuthService=new GoogleAuthManager();
		if ( googleAuthService.Login("armaganbice@hotmail.com", "123456"))
		{
	    	System.out.println("Google User login successfull");
		}
		else
		{
			System.out.println("Google User login is not ok");
		}
		
	}

}
