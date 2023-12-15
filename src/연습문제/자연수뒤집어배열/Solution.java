package 연습문제.자연수뒤집어배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[] ans = solution(12345);
		
		for(int i : ans) {
			System.out.println(i);
		}
	}
    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        
        while(n !=0) {
        	list.add((int) (n%10)) ;
        	n /= 10;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}