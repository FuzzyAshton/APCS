package unit9.lab4;

public class PizzaDriver {
	public static void main(String[] args) {
		PizzaOrder order = new PizzaOrder();
		order.addPizzaToOrder('l', true, true, false);
		order.addPizzaToOrder('m', true, true, false);
		order.addPizzaToOrder('s', false, true, false);
		order.addPizzaToOrder('l', true, true, false);
		order.addPizzaToOrder('m', false, false, false);
		order.addPizzaToOrder('s', false, false, false);
		order.addPizzaToOrder('l', true, false, false);
		System.out.println(order.calcCost());
	}
}