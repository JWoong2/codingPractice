package may.week1.Thread;

class ATMTwo implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
				if (getDepositeMoney() == 2000 || 
					getDepositeMoney() == 4000 || 
					getDepositeMoney() == 6000 || 
					getDepositeMoney() == 8000) {
					try {
						Thread.sleep(3* 1000);
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();//
					}
				} else {
					this.notify();
				}
			}
		}
	}

	public void withDraw(long howMuch) {
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("�ܾ� : %,d �� %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class WaitNotifyEx {
	public static void main(String[] args) {
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		mother.start();
		son.start();
	}
}







