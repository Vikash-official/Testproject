package inheritancePractise;

public class person {
	private String name;
	private String email;
	private int phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

@Override
public String toString() {
	return name + " " + email + " " + phone;

}

}
