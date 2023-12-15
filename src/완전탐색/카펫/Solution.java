package ¿ÏÀüÅ½»ö.Ä«Æê;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<=yellow; i++) {
        	if(yellow % i == 0) {
        		int w = i;
        		int h = yellow/i;
        		
        		if(brown == ((w+h)*2+4)) {
        			answer[0] = w+2;
        			answer[1] = h+2;
        		}
        	}
        }
        
        return answer;
    }
}