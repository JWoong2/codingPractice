package may.week4.Ex3.MemberManage;

public class Address implements Comparable<Address>{
	String name;
	String email;
	String phone;
	public Address(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " " + getEmail() + " " + getPhone();
	}

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
}
