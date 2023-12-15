package _월간코드챌린지.두개뽑아서더학;

import java.util.PriorityQueue;

class Solution {
	public static void main(String[] args) {
		int[] ans = solution(new int[] {2,1,3,4,1});
		
		for(int i : ans) {
			System.out.println(i);
		}
	}
	
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(!queue.contains(numbers[i] + numbers[j]) && i!=j ) queue.add(numbers[i] + numbers[j]); 
        	}
        }
        
        answer = new int[queue.size()];
        
        int index = queue.size();
        
        for(int i=0; i<index; i++) {
        	answer[i] = queue.poll();
        }
        
        return answer;
    }
}