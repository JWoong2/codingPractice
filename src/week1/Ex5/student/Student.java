package week1.Ex5.student;

public class Student {
	int id;
	int balance = 0;
	String name;
	String cardName;
	int cardId;
	int password;
	int count = 0;
	boolean account = true;

	public Student(int id, String name, int password, int cardId, String cName) {
		super();
		this.password = password;
		this.id = id;
		this.name = name;
		this.cardId = cardId;
		this.cardName = cName;
	}

	public boolean checkPassword(int num) {
		if (!account) {
			

		} else {
			while (count != 3) {
				if (num == password) {
					count = 0;

					return true;
				} else {
					count++;
				}
			}
			account = false;
		}

		return false;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int income) {
		this.balance += income;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

	public void showStudentData() {
		System.out.println(id + " " + name + " " + cardId + " " + cardName + " " + balance);
		System.out.println("avail " + account + " pass : " + password);
	}

}
