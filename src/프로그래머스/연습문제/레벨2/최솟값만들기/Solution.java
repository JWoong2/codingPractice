package 프로그래머스.연습문제.레벨2.최솟값만들기;

import java.util.Arrays;
import java.util.Collections;

// 효율성 실패
// 오름차순, 내림차순 정렬 다시 생각해보기

class Solution {
	public static void main(String[] args) {

	}

	public int solution(int[] A, int[] B) {
		int answer = 0;

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length-i];
		}

		return answer;
	}
}