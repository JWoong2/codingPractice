package _알고리즘.chapter4.시간복잡도;

import java.util.ArrayList;import javax.swing.plaf.basic.BasicBorders.MarginBorder;

// DESC : 주어진 배열에서 가장 많이 등장하는 숫자를 반환하기

// 주어진 배열A에서 가장 많이 등장하는 숫자를 반환한다.
// 만약 두 가지 이상 있을 경우 아무것이나 반환한다.

public class Exp {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(30);
		
		System.out.println(majority1(list));
		System.out.println(majority2(list));
	}
	
	public static int majority1(ArrayList<Integer> A) {
		int N = A.size();
		int majority = -1, majorityCount = 0;
		for(int i=0; i<N; i++) {
			int V = A.get(i), count = 0;
			for(int j=0; j<N; j++ ) {
				if(A.get(i) == V) {
					count++;
				}
			}
		
			// 지금까지 본 최대 빈도보다 많이 출현했다면 답을 갱신한다.
			if(count > majority) {
				majorityCount = count;
				majority = V;
				
			}
		}
		
		return majority;
	}
	
	public static int majority2(ArrayList<Integer> A) {
		int N = A.size();
		int[] array = new int[101];
		for(int i=0; i<N; i++) {
			array[A.get(i)]++;
		}
		
		int majority = 0;
		for(int i=1; i<=100; i++) {
			if(array[i] > array[majority]) {
				majority = i;
			}
		}
		
		return majority;
	}
}
