package may.week1.Thread;

public class JoinWorker extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
				System.out.println("joinWorker" + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
	}
}
