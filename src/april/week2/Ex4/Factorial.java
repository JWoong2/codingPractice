package april.week2.Ex4;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));
	}

	static int factorial(int n ) {
		if(n == 1) return 1;
		return n* factorial(n-1);
	}
}
