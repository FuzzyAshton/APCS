package unit1;

public class Nugget extends Chicken {

	public Nugget(double weight, String type) {
		super(weight, type);
	}
	@Override
	public void die(){
		System.out.println("I died but am tasty and good");
	}
}