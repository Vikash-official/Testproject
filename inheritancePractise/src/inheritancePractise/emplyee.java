package inheritancePractise;

public class emplyee extends person {
	private String title;
	private String employer;
	private int salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() { 
		return super.toString() + " #" + title + " " + employer + " " + salary;
	  

}
}
