package unit9.lab1;

public class DriverClass {
	public static void main(String[] args) {
		Card card1 = new Card("James");
		CallingCard card2 = new CallingCard("Ryan", "01189998819991197253", 1234);
		IDCard card3 = new IDCard("Aaron", "Definitely Aaron");
		DriverLicense card4 = new DriverLicense("Matt", "Definitely Matt", 2021);
		System.out.println(card1.format());
		System.out.println(card1.getName());
		System.out.println(card2.format());
		System.out.println(card2.getCardNumber());
		System.out.println(card2.getPIN());
		System.out.println(card3.format());
		System.out.println(card3.getID());
		System.out.println(card3.getName());
		System.out.println(card4.format());
		System.out.println(card4.getID());
		System.out.println(card4.getName());
		System.out.println(card4.getExpiration());
	}
}