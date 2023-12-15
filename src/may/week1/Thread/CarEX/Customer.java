package may.week1.Thread.CarEX;

public class Customer implements Runnable {
	private Car car;

	public Customer(Car car) {
		this.car = car;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			car.pop();
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}