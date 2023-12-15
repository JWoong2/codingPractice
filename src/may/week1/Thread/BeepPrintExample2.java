package may.week1.Thread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


