package �˰��򷦽�.level10.NN��ǥ;

import java.util.Scanner;

public class Main {
	static int n ;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// Please Enter Your Code Here
		n = sc.nextInt();
		long k = sc.nextLong();
		// 1 ~ n* n
		// ���ϰ��� �ϴ� ���� p�� ���°�ΰ�?
		
		long start = 1, end = n*n+1;
		
		while(start+1 < end) {
			// start : �׻� ������ �Ǵ� ���ں��� �۰ų� ���� ����
			// end : �׻� ������ �Ǵ� ���ں��� ū ����
			long mid = (start + end) / 2;
			long myOrder = getOrder(mid);
			
			if(myOrder <= k ) {
				start = mid;
			}else {
				end = mid;
			}
		}
		
		System.out.println(start);
	}
	
	private static long getOrder(long x) {
		long result = 0;
		
		for(int i=1; i<=n; i++) {
			if((long)(i*n) < x) result += n;
			else {
				if(x % i == 0) result += (x/i) -1;
				else result += x/i;	
			}
		}
		
		return result+1;
	}
}