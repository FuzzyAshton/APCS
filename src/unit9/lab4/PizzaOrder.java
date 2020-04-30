package unit9.lab4;

import java.util.ArrayList;

public class PizzaOrder {
	ArrayList<Pizza> pizzas;

	public PizzaOrder() {
		pizzas = new ArrayList<Pizza>();

	}

	public int numPizzas() {
		return pizzas.size();
	}

	public double calcCost() {
		double cost = 0;
		for (Pizza e : pizzas) {
			cost += e.getPrice();
		}
		return cost;
	}

	public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms) {
		pizzas.add(new Pizza(pepperoni, sausage, mushrooms, size));
	}
}