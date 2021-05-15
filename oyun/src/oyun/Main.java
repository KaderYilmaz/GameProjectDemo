package oyun;

import java.time.LocalDate;

import oyun.concretes.DiscountManager;
import oyun.concretes.MarketManager;
import oyun.concretes.UserCheckManager;
import oyun.concretes.UserManager;
import oyun.entities.Discount;
import oyun.entities.Game;
import oyun.entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User (1, "Kader", "Yılmaz", LocalDate.of(1999,02,01), "1234567890");
		Game game = new Game ("---", 250);
		Discount discount = new Discount ("Yaz indirimi", 25);
		
		UserManager userManager = new UserManager(new UserCheckManager());
		MarketManager marketManager = new MarketManager();
		DiscountManager discountManager = new DiscountManager();
		
		userManager.add(user);
		userManager.update(user);
		userManager.delete(user);
		System.out.println();
		discountManager.add(discount);
		discountManager.update(discount);
		discountManager.delete(discount);
		System.out.println();
		marketManager.buy(game, user);
		marketManager.buy(game, user, discount);
	}

}
