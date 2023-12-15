package may.week1.Thread.CarEX;

import java.util.*;

public class Car {
	private List<String> carList = null;

	public Car() {
		carList = new ArrayList<String>();
	}

	public String getCar() {
		String carName = null;
		switch ((int) (Math.random() * 3)) {
		case 0:
			carName = "아우디 Q2";
			break;
		case 1:
			carName = "애스턴마틴 DBX";
			break;
		case 2:
			carName = "포르쉐 타이칸";
			break;
		}
		return carName;
	}

	public synchronized void pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("  차가 없어요 생산할때 까지 " + " 기다리세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println(" 손님이 차를 사갔습니다.." + "손님이 구입한 차이름은 =>\" " + carName + "\"");
	}

	//synchronized 동시에 접근되는걸 막음 쓰레드에서 보통 많이 사용됌
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println(" 차가 만들어 졌습니다. " + " 차이름은 \" " + car + "\"");
		if (carList.size() == 5) {
			this.notify();
		}
	}
}