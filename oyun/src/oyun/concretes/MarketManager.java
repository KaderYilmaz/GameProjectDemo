package oyun.concretes;

import oyun.abstracts.MarketService;
import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public class MarketManager  implements MarketService{
	
	public void buy(Game game, User user) {
		System.out.println(user.getFirstName() +" "+ game.getName()+ " oyununu aldý, " +game.getPrice()+ "tl ödedi.");
		
		
	}
    
	public void buy(Game game, User user, Discount discount) {
		System.out.println(discount.getName()+ " kampayasý kullanýldý.");
		System.out.println(user.getFirstName()+" "+ game.getName()+ " oyununu aldý, "+(game.getPrice()-discount.getValue())+ " tl ödendi.");
		
		
	}
}
