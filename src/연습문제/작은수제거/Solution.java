package ��������.����������;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] ans = solution(new int[] { 4,3,2,1});
		
		for(int i : ans) {
			System.out.println(i);
		}
	}
    public static int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
        	return new int[] {-1};
        }else {
        	answer = new int[arr.length-1];
        	int index = 0;
        	for(int i = 0; i< arr.length; i++) {
        		if(Arrays.stream(arr).min().getAsInt() == arr[i]) continue;
        		//�ε����� �������� ��.. 
        		answer[index++] = arr[i];
        	}
        }
        
        
//        int min  = Arrays.stream(arr).min().getAsInt();
        
        //���͸� �ϴ� ��� 
//        Arrays.stream(arr).filter(x-> x != min).toArray();
        
        return answer;
    }
}