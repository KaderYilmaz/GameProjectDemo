package oyun.abstracts;

import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public interface MarketService {
	
	void buy(Game game, User user);
	void buy(Game game, User user, Discount discount);

}
