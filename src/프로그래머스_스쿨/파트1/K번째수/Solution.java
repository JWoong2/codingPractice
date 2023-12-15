package 프로그래머스_스쿨.파트1.K번째수;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	int start = commands[i][0];
        	int end = commands[i][1];
        	int sel = commands[i][2];
        	
        	answer[i] = getNumber(start, end, sel, array);
        }
        
        return answer;
    }
    
    private static int getNumber(int s, int e, int sel, int[] arr) {
    	int num= 0;
    	// 2 5 
    	int[] temp = new int[(e-s)+1];
    	int index=0;
    	for(int i=s-1; i<=e-1; i++) {
    		temp[index++] = arr[i];
    	}
    	
    	Arrays.sort(temp);
    	num = temp[sel-1];
    	
    	return num;
    }
}