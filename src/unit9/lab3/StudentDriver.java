package unit9.lab3;

public class StudentDriver {
	public static void main(String[] args) {
		UnderGrad thing1 = new UnderGrad("Yes", "CS", 9001);
		UnderGrad thing2 = new UnderGrad("Adam", "EECS", 5026);
		Graduate grad1 = new Graduate("Grace", "Something", 4904);
		Graduate grad2 = new Graduate("Isabel", "CS", 254);
		PostGraduate grad3 = new PostGraduate("Jim", "Math", 1969);
		PostGraduate grad4 = new PostGraduate("Carolyn", "English", 7419);
		Student[][] students = { { grad3, grad4 }, { grad1, grad2 }, { thing1, thing2 } };
		for (Student[] list: students) {
			for (Student e: list) {
				System.out.println(e);
			}
		}
	}
}