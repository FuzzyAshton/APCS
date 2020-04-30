package unit9.lab5;

public class HarvardLawyer extends Lawyer {
	public HarvardLawyer() {
		super();
		super.setSalary(super.showSalary() * 1.2);
		super.setVacation(super.showVacation() + 3);
		super.setForm(super.applyForVacation() + super.applyForVacation() + super.applyForVacation() + super.applyForVacation());
	}
}