package april.week3.Ex2.Stream;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2 ,3 ,4 ,5};
		
		Arrays.stream(arr)
		.filter(a->a%2==0)
		.peek(n-> System.out.println("첫번째 메소드 : " + n));
		
		int total = Arrays.stream(arr)
		.filter(a->a%2==0)
		.peek(n-> System.out.println("peek : " + n))
		.sum();
		
		System.out.println("total : "  + total);
		
		System.out.println("4번째 메소드 : ");
		Arrays.stream(arr)
		.filter(a->a%2==0)
		.forEach(n -> System.out.println(n));
		
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("최소값 : " + min);
		min = Arrays.stream(arr).filter(e->e%2==0).min().getAsInt();
		System.out.println("2의 배수 중 최소값 : " + min);
		
		int first = Arrays.stream(arr).filter(e->e%2==0).findAny().getAsInt();
		System.out.println(first);
	}

}
