package week2.Ex1;

public class ArrayProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2 = {{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total=0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				total+=arr2[i][j];
			}
		}
		
		System.out.println("total="+ total);
		System.out.println("average="+ (double) total/(arr2.length*arr2[0].length));
	}

}
