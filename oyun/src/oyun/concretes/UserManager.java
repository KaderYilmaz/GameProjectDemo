package oyun.concretes;

import oyun.abstracts.UserCheckService;
import oyun.abstracts.UserService;
import oyun.entities.User;

public class UserManager implements  UserService{
	
	UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
		
	}
	
	public void add(User user) {
		
		userCheckService.checkIfRealPerson(user);
		System.out.println("Kullanýcý eklendi: " + user.getFirstName());
		
		
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncelledi: "+ user.getFirstName());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silinci: "+ user.getFirstName());
		
	}
	
}
