package may.week4.Ex3.Customer;

import java.io.*;

public class Customer implements Serializable {

	//����ȭ �������� �����ϰ�������� transient �Ѵ�.
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
		return "����� �̸�:" + name;
	}

}
