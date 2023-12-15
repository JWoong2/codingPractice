package may.week1.Thread;

public class JoinMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinWorker thread = new JoinWorker();
		thread.start();
		
		System.out.println("종료될때까지 wait");
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
