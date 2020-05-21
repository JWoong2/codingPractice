package week2.Ex4;

public class Account {
	String account;
	int balance;
	double interesRate;
	
	Account(){}

	public Account(String account, int balance, double interesRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interesRate = interesRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public double calculateInterest() {
		return balance * interesRate / 100;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void showInfo() {
		System.out.println("계좌정보 : " + getAccount() + " 현재잔액: " + getBalance() );
	}
	
	public void showRate() {
		System.out.println("이자 : " + calculateInterest());
	}
}
