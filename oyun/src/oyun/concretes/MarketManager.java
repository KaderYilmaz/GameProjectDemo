package oyun.concretes;

import oyun.abstracts.MarketService;
import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public class MarketManager  implements MarketService{
	
	public void buy(Game game, User user) {
		System.out.println(user.getFirstName() +" "+ game.getName()+ " oyununu ald�, " +game.getPrice()+ "tl �dedi.");
		
		
	}
    
	public void buy(Game game, User user, Discount discount) {
		System.out.println(discount.getName()+ " kampayas� kullan�ld�.");
		System.out.println(user.getFirstName()+" "+ game.getName()+ " oyununu ald�, "+(game.getPrice()-discount.getValue())+ " tl �dendi.");
		
		
	}
}
