package week2.Ex1;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		int number =  0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
				}
			number += array[i].length;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (double) sum/number);
	}

}
