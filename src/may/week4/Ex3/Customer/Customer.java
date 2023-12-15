package may.week4.Ex3.Customer;

import java.io.*;

public class Customer implements Serializable {

	//직렬화 과정에서 제외하고싶은것을 transient 한다.
//	private transient String name;
	private String name;

	public Customer(String name) {
		this.name = name;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "당신의 이름:" + name;
	}

}
