package april.week3.Ex5.Test;

public class Polilymorphism {
	private void f() {System.out.println("base");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polilymorphism po = new Derived();
		po.f();
		
		Derived te = new Derived();
		te.test();
		te.f();
	}
}

class Derived extends Polilymorphism {
	public void f() {
		System.out.println("sub");
	}
	
	public void test() {
		System.out.println("sub");
	}
}