package unit4.lab2;

public class Student {
	private String firstName;
	private String lastName;
	private String major;
	private double[] grades;
	private double debt;

	public Student() {
		firstName = "John";
		lastName = "Smith";
		major = "English";
		grades = new double[5];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = 0.0;
		}
		debt = 100000;
	}

	public Student(String firstName, String lastName, String major, double[] grades, double debt) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.grades = grades;
		this.debt = debt;
	}

	public String toString() {
		return lastName + ", " + firstName + "\nMajor in " + major + "\nGPA: " + calcGPA() + "\n" + firstName + "'s Grade is: " + getGrade() + "\n" + getGrades() + "\nStudent Debt: " + debt;
	}

	public void setGPA(double[] grades) {
		for (int i = 0; i < this.grades.length; i++) {
			this.grades[i] = grades[i];
		}
	}

	public double calcGPA() {
		double sum = 0.0;
		for (double e: grades) {
			sum += e;
		}
		return sum / grades.length;
	}

	public String getGrade() {
		double gpa = calcGPA();
		if (gpa < 1.0) {
			return "F";
		}
		else if (gpa < 2.0) {
			return "D";
		}
		else if (gpa < 3.0) {
			return "C";
		}
		else if (gpa < 4.0) {
			return "B";
		}
		else {
			return "A";
		}
	}

	public String getGrades() {
		String grades = "";
		for (double e: this.grades) {
			grades += (e + " ");
		}
		return grades;
	}
}