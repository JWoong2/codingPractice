package week4.Ex1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 39, 40, 41, 42, 43, 44, 82, 83, 84, 85};
		
		for(int i = 0 ; i<array.length; i++) {
			array[i] %= 42;
		}
		
		for(int i : array) {
			System.out.println(i);
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int cnt =0;
		
		for(int i=0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] == array[j]) cnt++;
			}
		}
		
		int answer = array.length-cnt;
		
		System.out.println("cnt : " + cnt);
		System.out.println("ans : " + answer);
		
		for(int i = 0; i<array.length; i++) {
			if( !queue.contains(array[i])) {
				queue.add(array[i]);
			}
		}
		
		for(int i : queue) {
			System.out.println("queue·Î »ÌÀº °ª : " + i);
		}
		
		System.out.println(Arrays.stream(array).distinct().count());
		
		
		Arrays.stream(array).distinct().forEach(x->System.out.println(x));
	}
}
