package oyun.concretes;

import oyun.abstracts.UserCheckService;
import oyun.entities.User;

public class UserCheckManager implements UserCheckService {
	
	public void checkIfRealPerson(User user) {
		
		System.out.println("Bu kiþi gerçektir: " + user.getFirstName());
		
	}

}
