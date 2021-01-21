package inheritancePractise;

public class employeeRunner {

	public static void main(String[] args) {
		emplyee emp = new emplyee();
		person pe = new person();
		System.out.println(emp);
		System.out.println(pe);

		emp.setEmail("v@gmail.com");
		emp.setName("vikas");
		emp.setPhone(123456789);
		emp.setEmployer("tcs ");
		emp.setSalary(25000);
		emp.setTitle("singh");

		System.out.println(emp);
		System.out.println(pe);

	}

}
