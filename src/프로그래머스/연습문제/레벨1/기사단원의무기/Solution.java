package ���α׷��ӽ�.��������.����1.���ܿ��ǹ���;

import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        ArrayList<Integer> weapon = new ArrayList<>();
        
        for(int i=1; i<=number; i++) {
        	int n = i; // �Է� ��
        	int sqrt = (int) Math.sqrt(n); // 100�� �������� 10
        	int count = 0;

        	for(int j = 1; j <= sqrt; j++){
        	   if(n % j == 0){ // ��� �� ���� �� ����
        	    count++;
        	        if(n / j != j){ // ��� �� ū �� ����
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