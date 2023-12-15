package 연습문제.자릿수더하기;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int ans = solution(123);
		System.out.println(ans);
	}
    public static int solution(int n) {
        int answer = 0;

        while(n !=0 ) {
        	answer += n%10;
        	n/=10;
        }

        return answer;
    }
}