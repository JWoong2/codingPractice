package week1.Ex4;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10]; 
		
		for(int i = 0 ; i<array.length; i++) {
			array[i] = i;
		}
		
		for(int i : array)  {
			System.out.println(i);
		}
		
	}

}
