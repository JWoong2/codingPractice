package 백준.함수.셀프넘버;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] numArray = new boolean[10001];
		
		for(int i=1; i<10000; i++) {
			int index = sum(i);
			numArray[index] = true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(!numArray[i]) System.out.println(i);
		}
	}
	
	private static int sum(int num) {
		int sum = num;
		
		while(num !=0) {
			sum += num%10;
			num/=10;
		}
		if(sum >10000) return 0;
		return sum;
	}

}
