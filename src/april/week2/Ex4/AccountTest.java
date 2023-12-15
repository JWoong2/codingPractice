package april.week2.Ex4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		//기본 정보 출력
		account.showInfo();
		
		//20000원 입금
		account.deposit(20000);
		
		//변경 정보 출력
		account.showInfo();
		
		//이자 출력
		account.showRate();
		
	}

}
 