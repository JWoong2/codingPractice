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

//			System.out.printf("스레드 이름  : %s %n" , 
//					Thread.currentThread().getName());
			
		}
	}
	
	public static void test() {
		System.out.println("this is test");
	}
	
	public static void main(String[] args) {
		MultiThreadEx srt1 = new MultiThreadEx();
		Thread firstThread = new Thread(srt1, "첫번째 스레드");
		MultiThreadEx srt2 = new MultiThreadEx();
		Thread secondThread = new Thread(srt2, "두번째 스레드");
		
		
		firstThread.start();
		secondThread.start();
	}
}

