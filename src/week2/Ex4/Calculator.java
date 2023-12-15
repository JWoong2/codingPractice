package week2.Ex4;

public class Calculator {
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return Math.abs(x-y);
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
	
	public void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
}
