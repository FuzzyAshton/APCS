package unit9.lab5;

// A class to represent employees in general.
public class Employee {
	private String vacationForm;
	private int hours;
	private double salary;
	private int vacationDays;

	public Employee() {
		vacationForm = "yellow";
		hours = 40;
		salary = 40000;
		vacationDays = 14;
	}

	public Employee(String vacationForm, int hours, int salary, int vacationDays) {
		this.vacationForm = vacationForm;
		this.hours = hours;
		this.salary = salary;
		this.vacationDays = vacationDays;
	}

	public String applyForVacation() {
		return vacationForm;
	}

	public int showHours() {
		return hours;
	}

	public double showSalary() {
		return salary;
	}

	public int showVacation() {
		return vacationDays;
	}

	public void setForm(String vacationForm) {
		this.vacationForm = vacationForm;
	}

	public void setVacation(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String toString() {
		return "Vacation Form: " + applyForVacation() + "\nHours: " + showHours() + "\nSalary: " + showSalary() + "\nVacation days: " + showVacation();
	}
}
