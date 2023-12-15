package april.week2.Ex4;

public class IntArray {
	int[] arr = new int[50];
	int index=0;
	int sum = 0;
	
	public void addArray(int i) {
		arr[index++] = i;
	}
	
	public int addAll() {
		for(int i : arr) sum +=i;
		return sum;
	}
}
