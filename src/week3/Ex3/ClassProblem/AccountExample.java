package week3.Ex3.ClassProblem;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("¿‹∞Ì : " + account.getBalance());
		account.setBalance(-10000);
		System.out.println("¿‹∞Ì : " + account.getBalance());
		account.setBalance(2210000);
		System.out.println("¿‹∞Ì : " + account.getBalance());
		account.setBalance(300000);
		System.out.println("¿‹∞Ì : " + account.getBalance());
	}
}
