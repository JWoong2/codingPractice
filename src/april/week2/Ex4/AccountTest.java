package april.week2.Ex4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		//�⺻ ���� ���
		account.showInfo();
		
		//20000�� �Ա�
		account.deposit(20000);
		
		//���� ���� ���
		account.showInfo();
		
		//���� ���
		account.showRate();
		
	}

}
 