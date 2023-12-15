package 프로그래머스_스쿨.파트4.구명보트;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
//		int[] people = {70, 50, 80, 50};
		int[] people = {70, 80, 50};
		
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int a = 0;
        int b = people.length-1;
        
        while(a <= b) {
        	if(people[a] + people[b]<= limit) {
        		a++;	
        	}
        	b--;
        	answer++;
        }
        
        return answer;
    }
}