package ab_ecommerce.entities.concretes;

import ab_ecommerce.core.entities.abstracts.Entity;

public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String passWord;
	private String email;
	private boolean isRegistered;

	public User()
	{
    }
	
	public User(int id, String firstName, String lastName, String passWord, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.email = email;
	}
	
	public User(String firstName, String lastName, String passWord, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.passWord = passWord;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}
	

}
