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
			carName = "�ƿ�� Q2";
			break;
		case 1:
			carName = "�ֽ��ϸ�ƾ DBX";
			break;
		case 2:
			carName = "������ Ÿ��ĭ";
			break;
		}
		return carName;
	}

	public synchronized void pop() {
		String carName = null;
		if (carList.size() == 0) {
			try {
				System.out.println("  ���� ����� �����Ҷ� ���� " + " ��ٸ�����");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String) carList.remove(carList.size() - 1);
		System.out.println(" �մ��� ���� �簬���ϴ�.." + "�մ��� ������ ���̸��� =>\" " + carName + "\"");
	}

	//synchronized ���ÿ� ���ٵǴ°� ���� �����忡�� ���� ���� ����
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println(" ���� ����� �����ϴ�. " + " ���̸��� \" " + car + "\"");
		if (carList.size() == 5) {
			this.notify();
		}
	}
}