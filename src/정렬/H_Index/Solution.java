package 정렬.H_Index;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int a = solution(new int[] {3, 0, 6, 1, 5});
		
	}
    public static int solution(int[] citations) {
        int answer=0;

        Arrays.sort(citations);
        
        for(int i : citations) {
        	System.out.println(i);	
        }
        
        System.out.println("길이 :" + citations.length);
        
        for(int i=0; i<citations.length; i++) {
        	if( citations[i] >= (citations.length-i)) 
        		return citations[i];
        }
        
        return answer;
    }
}