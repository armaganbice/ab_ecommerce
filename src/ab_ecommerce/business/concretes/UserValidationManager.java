package ab_ecommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ab_ecommerce.business.abstracts.UserService;
import ab_ecommerce.business.abstracts.UserValidationService;
import ab_ecommerce.entities.concretes.User;

public class UserValidationManager implements UserValidationService{

	private UserService userService;
	
	private ArrayList<String> _errors  =new ArrayList<String>();
	private ArrayList<String> _messages=new ArrayList<String>();
	
	private int minPassWordLength=6;  // Minumum PassWord Length
	private int minNameLength=2;      // Minumum Name Length
	
	public UserValidationManager(UserService userService)
	{
		this.userService=userService;
	}

	@Override
	public boolean validate(User user) {
		
		
		if ( CheckPassWordLength(user) )
		{
			System.out.println(_errors);
			return false;
		}

		if ( CheckEmailFormat(user) )
		{
			System.out.println(_errors);
			return false;
		}

		if ( CheckEmailisExist(user) )
		{
			System.out.println(_errors);
			return false;
		}
		
		if (CheckLastNameAndFirstNameLenght(user))
		{
			System.out.println(_errors);
			return false;
		}

		System.out.println(_messages);
		return true;
	}
	
	
	private boolean CheckPassWordLength(User user)
	{
		if (user.getPassWord().length() < minPassWordLength)
		{
			_errors.add("Password Length error");
			return true;
		}
		_messages.add("Password Length ok\n");
		return false;
	}
	
	
	private boolean CheckEmailFormat(User user)
	{
		if ( !emailRegexCheck(user.getEmail()) )
		{
     		_errors.add("Email Format error");
     		return true;
		}
		_messages.add("Email Format ok\n");
		return false;
	}
	
	private boolean CheckEmailisExist(User user)
	{
		User _user=new User();
		_user=userService.getByEmail(user.getEmail());
		if (_user != null)
		{
		   if (_user.getEmail().length()>0)
		   {
			  _errors.add("Email is exist");
		    	// return true; kayýt olmadýðý için
			    _messages.add("Check Email is ok\n");
		    	return false;  // fake test için
		    }
		}
		_messages.add("Check Email is ok\n");
		return false;
	}
	
	private boolean CheckLastNameAndFirstNameLenght(User user)
	{
		if (    
				user.getFirstName().length() < minNameLength ||
				user.getLastName().length()  < minNameLength	
	 	)
		{
			_errors.add("LastName&FirstName length is not enough");
			return true;
		}
		_messages.add("LastName&FirstName ok\n");
		return false;
	}
	
	
	boolean emailRegexCheck(String email)
	{
		// Regex for all conditions
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
