package week3.Ex4;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() Call");
	}

	public Parent(String nation) {
		super();
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
	
	
}
