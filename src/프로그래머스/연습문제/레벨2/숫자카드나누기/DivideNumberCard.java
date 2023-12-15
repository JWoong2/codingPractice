package 프로그래머스.연습문제.레벨2.숫자카드나누기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DivideNumberCard {
	public static void main(String[] args) {
		int[] arrayA = { 10, 17 };
		int[] arrayB = { 5, 20 };

		solution(arrayA, arrayB);
	}

	// 양의 정수 최대값을 구하기 위한 리스트
	static List<Integer> numberList = new ArrayList<Integer>();

	public static int solution(int[] arrayA, int[] arrayB) {
		int answer = diff(arrayA, arrayB);
		
		System.out.println(answer);
		
		return answer;
	}

	// A to B
	public static int diff(int[] arrayA, int[] arrayB) {
		int answer = 0;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=2; i<=arrayA[0]; i++) {
			if(arrayA[0] % i == 0) {
				set.add(i);
			}
		}
		
		for(int i=2; i<=arrayB[0]; i++) {
			if(arrayB[0] % i == 0) {
				set.add(i);
			}
		}
	
		List<Integer> list = new ArrayList<Integer>(set);
		
		for(int i=0; i<list.size(); i++) {
			boolean isTrue = true;
			
			for(int j=0; j<arrayA.length; j++) {
				if(arrayA[j] % list.get(i) != 0 || arrayB[j] % list.get(i) == 0) {
					isTrue = false;
					break;
				}
			}
			
			if(isTrue) {
				answer = Math.max(answer, list.get(i));
			}
			
			isTrue = true;
			
			for(int j=0; j<arrayB.length; j++) {
				if(arrayB[j] % list.get(i) != 0 || arrayA[j] % list.get(i) == 0) {
					isTrue = false;
					break;
				}
			}
			
			if(isTrue) {
				answer = Math.max(answer, list.get(i));
			}
		}
		
		return answer;
	}
}
