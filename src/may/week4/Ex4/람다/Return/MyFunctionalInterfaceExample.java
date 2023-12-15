package may.week4.Ex4.¶÷´Ù.Return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		MyFunctionalInterface f2 =  (x, y) -> {
			return x*y;
		};
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fi.method(2, 5));
		System.out.println(f2.method(2, 5));
		
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}











