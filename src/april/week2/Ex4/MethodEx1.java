package april.week2.Ex4;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Stringer ch = new Stringer();
		IntArray in = new IntArray();
		
		while(run)
		{
			System.out.println("1. 문자열을 입력받아서 해당 문자열을 출력하는 리턴 값이 없는 메서드 print");
			System.out.println("2. int배열을 입력받아 그안에 있는 모든 숫자를 더하고 그 값을 리턴하는 메서드 add");
			System.out.println("3. 랜덤값(1~10)을 리턴하는 메서드 random_100");
			switch (sc.nextInt()) {
			case 1:
				while(run) {
					System.out.println("출력은 0 입력");
					if(sc.nextInt() == 0 ) {
						System.out.println("종료");
						ch.showAll();
					}
					
					System.out.println("문자열을 입력하세요");
					ch.addString(sc.next());
				}
				
				break;

			case 2 :
				while(run) {
					int num =0;
					System.out.println("0은 출력");
					num = sc.nextInt();
					if(num == 0 ) {
						System.out.println(in.addAll());
						break;
					}
					in.addArray(num);
				}
				break;
				
			case 3 : 
				RandomMethod rd = new RandomMethod();
				System.out.println(rd.random());
				break;
				
			default:
				run = false;
				break;
			}
		}
		
	}

}
