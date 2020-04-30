package unit9.lab3;

public class StudentAdvance extends Advance {
	
	public StudentAdvance(int daysAhead) {
		super(daysAhead);
	}
	
	@Override
	public double getPrice() {
		return super.getPrice() / 2;
	}

	public String toString() {
		return super.toString() + "\nRequires Student ID";
	}
}