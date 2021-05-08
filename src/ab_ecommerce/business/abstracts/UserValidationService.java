package ab_ecommerce.business.abstracts;

import ab_ecommerce.entities.concretes.User;

public interface UserValidationService {
	
	public boolean validate(User user);

}
