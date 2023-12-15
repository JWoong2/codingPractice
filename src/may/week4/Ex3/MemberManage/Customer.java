package may.week4.Ex3.MemberManage;

public class Customer implements Comparable<Customer> {
	String name;
	String email;
	String phoneNum;

	public Customer(String name, String email, String phoneNum) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}

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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " " + getEmail() + " " + getPhoneNum();
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Customer) {
			Customer c = (Customer) obj;
			return this.name.equals(c.name);
		}
		return false;
	}
}
