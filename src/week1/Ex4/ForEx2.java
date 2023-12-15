package week1.Ex4;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100 사이 값의 합을 출력
		int sum=0 ;
		
		for(int i = 1 ; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1부터 100까지의 합 : "+ sum);
	}

}
