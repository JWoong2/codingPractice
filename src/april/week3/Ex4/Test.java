package april.week3.Ex4;

class Super {
	int index = 5;

	private void printVal() {
		System.out.println("super");
	}

}

abstract  class wow {
		
}

class good {
	
}
class Sub extends Super{
	int index = 3;

	public void printVal() {
		System.out.println("sub");
	}
}

class Test {
	private int x;
	private int X;
	
	private Test(int x) {
		this.x = x;
		this.X =x;
	}

	public static void main(String[] args) { // TODO Auto-generated method stub
		int idx = 0 ;
		char[] charArray = new char[10];
		charArray[idx++] = '0';
		charArray[idx++] = 65;
		charArray[idx++] = 'A'+1;
		
	System.out.println(charArray);
	}

	public static void method(Test v1, Test v2) {
		v2.x = 20;
		v1 = v2;
	}
}
