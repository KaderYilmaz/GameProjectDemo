package oyun.concretes;

import oyun.abstracts.DiscountService;
import oyun.entities.Discount;

public class DiscountManager implements DiscountService {
	
	public void add(Discount discount) {
		System.out.println("Yeni kampanya eklendi: "+ discount.getName() + ", "+ discount.getValue());
		
	}

	public void update(Discount discount) {
		System.out.println("Kampanya güncellendi: "+ discount.getName() + ", "+ discount.getValue());
		
	}
	
	public void delete(Discount discount) {
		System.out.println("Kampanya silindi: "+ discount.getName());
		
	}
}
