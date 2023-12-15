package april.week3.Ex4;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("child() Call");
	}

	public Child(String name) {
		this.name= name;
		System.out.println("child(String name) call");
	}
	
	
}
