package unit4.lab2;

public class StudentDriver {
	public static void main(String[] args) {
		Student collegeStudent1 = new Student();
		System.out.println(collegeStudent1);
		double[] grades = {4.0, 3.0, 3.0, 3.8, 3.7};
		collegeStudent1.setGPA(grades);
		System.out.println(collegeStudent1);

		double[] grades2 = {4.0, 4.0, 3.3, 3.7, 4.0};
		Student collegeStudent2 = new Student("James", "Varah", "Swagenometry", grades2, 0);
		System.out.println(collegeStudent2);
		collegeStudent2.setGPA(grades);
		System.out.println(collegeStudent2);
	}
}