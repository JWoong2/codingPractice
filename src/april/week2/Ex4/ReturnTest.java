package april.week2.Ex4;

import java.util.Scanner;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Calculator ca = new Calculator();		
		int[] result2 = new int[50];
		int x,y;
		int result2Idx = 0;
		
		//그냥 결과가 저장되는게 제일 좋지 않나
		
		while(run) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 결과 배열에 저장");
			
			switch(sc.nextInt()) {
			case 1 : 
				System.out.println("더할 숫자");
				x=sc.nextInt();
				System.out.println("더할 숫자");
				y=sc.nextInt();
				result = ca.add(x, y);
				System.out.println(ca.add(x, y));
				
				break;
			case 2 : 
				System.out.println("뺄 숫자");
				x=sc.nextInt();
				System.out.println("뺄 숫자");
				y=sc.nextInt();
				result= ca.sub(x, y);
				System.out.println(ca.sub(x, y));
				break;
			case 3 :
				System.out.println("곱할 숫자");
				x=sc.nextInt();
				System.out.println("곱할 숫자");
				y=sc.nextInt();
				result  = ca.mul(x, y);
				System.out.println(ca.mul(x, y));
				break;
			case 4 :
				System.out.println("나눌 숫자");
				x=sc.nextInt();
				System.out.println("나눌 숫자");
				y=sc.nextInt();
				result = ca.div(x, y);
				System.out.println(ca.div(x, y));
				break;
				
			case 5 : 
				result2[result2Idx++] = result;
				break;
			default : 
				for(int i = 0; i<result2Idx; i++) {
					System.out.println(result2[i]);
				}
				System.out.println("종료");
				run = false;
			}
		}
		
	}

}
