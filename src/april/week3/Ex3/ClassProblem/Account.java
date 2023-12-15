package april.week3.Ex3.ClassProblem;

public class Account {
	final int MIN_BALANCE=0;
	final int MAX_BALANCE=1000000;
	
	int balance = 0;
	private String ano;
	private String owner;
	

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public Account() {
		super();
	}

	public Account( String ano, String owner, int balance) {
		// TODO Auto-generated constructor stub
		super();
		this.balance = balance;
		this.ano = ano;
		this.owner = owner;
	}

	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return ;
		}else {
			this.balance = balance;	
		}
	}
	
	
}
