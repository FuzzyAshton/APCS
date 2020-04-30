package unit9.lab4;

public class Pizza {
	private boolean pepperoni;
	private boolean sausage;
	private boolean mushrooms;
	private char size;

	public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
		this.pepperoni = pepperoni;
		this.sausage = sausage;
		this.mushrooms = mushrooms;
		this.size = size;
	}

	public char getSize() {
		return size;
	}

	public int getNumToppings() {
		int toppings = 0;
		if (pepperoni) {
			toppings++;
		}
		if (sausage) {
			toppings++;
		}
		if (mushrooms) {
			toppings++;
		}
		return toppings;
	}

	public int getPrice() {
		int price = 0;
		if (size == 's') {
			price = 8;
		}
		else if (size == 'm') {
			price = 10;
		}
		else {
			price = 12;
		}
		price += getNumToppings();
		return price;
	}
}