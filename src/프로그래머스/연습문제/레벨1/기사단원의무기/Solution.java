package 프로그래머스.연습문제.레벨1.기사단원의무기;

import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        ArrayList<Integer> weapon = new ArrayList<>();
        
        for(int i=1; i<=number; i++) {
        	int n = i; // 입력 값
        	int sqrt = (int) Math.sqrt(n); // 100의 제곱근은 10
        	int count = 0;

        	for(int j = 1; j <= sqrt; j++){
        	   if(n % j == 0){ // 약수 중 작은 수 저장
        	    count++;
        	        if(n / j != j){ // 약수 중 큰 수 저장
        	            count++;
        	        }
        	    }
        	}
        
        	if(limit < count) {
        		count = power;
        	}
        	
        	weapon.add(count);
        }
        
        for(int i=0; i<weapon.size(); i++) {
        	answer += weapon.get(i);
        }
        
        return answer;
    }
}