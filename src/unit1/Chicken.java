package unit1;

public class Chicken {
	protected double weight;
	protected String type;
	public Chicken(double weight, String type){
		this.weight = weight;
		this.type = type;
	}
	public void die(){
		System.out.println("I am dead and useless");
	}
}