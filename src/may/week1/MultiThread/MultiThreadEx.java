package may.week1.MultiThread;

public class MultiThreadEx implements Runnable {
	public void run() {
		int first = 0;
		int second = 0;
		for (int i = 0; i < 5; i++) {
			first++;
			second++;
			System.out.printf("first : %d , " , first);
			System.out.printf("second : %d , " , second);
System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getState());

//			System.out.printf("������ �̸�  : %s %n" , 
//					Thread.currentThread().getName());
			
		}
	}
	
	public static void test() {
		System.out.println("this is test");
	}
	
	public static void main(String[] args) {
		MultiThreadEx srt1 = new MultiThreadEx();
		Thread firstThread = new Thread(srt1, "ù��° ������");
		MultiThreadEx srt2 = new MultiThreadEx();
		Thread secondThread = new Thread(srt2, "�ι�° ������");
		
		
		firstThread.start();
		secondThread.start();
	}
}

