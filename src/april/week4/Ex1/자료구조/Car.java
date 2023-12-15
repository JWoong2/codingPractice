package april.week4.Ex1.자료구조;

public class Car {
	private String model;
	public String owner;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}
}
