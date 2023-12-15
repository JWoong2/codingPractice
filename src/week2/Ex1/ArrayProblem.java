package week2.Ex1;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int sum=0;
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("sum=" + sum);
		System.out.println("avg=" + sum/arr.length);
		
	}

}
