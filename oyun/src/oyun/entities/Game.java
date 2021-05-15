package oyun.entities;

public class Game {
	
	String name;
	int Price;
	
	public Game(String name, int price) {
		super();
		this.name = name;
		Price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	
}
