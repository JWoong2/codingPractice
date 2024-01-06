package 프로그래머스.연습문제.레벨2.연속된부분수열의합;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int[] sequence = {1, 1, 1, 2, 3, 4, 5};
//			int[] sequence = {1, 2, 3, 4, 5};
//			int[] sequence = {2, 2, 2, 2, 3};
			int[] sequence = {1,1,1,1,1,1,3};
			
			int[] answer = solution(sequence, 3);
			System.out.println(answer[0] + " " + answer[1]);
	}
	
	public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        
        int st = 0;
        int ed = 1;
        int sum = sequence[st];
        int min = Integer.MAX_VALUE;
        
        while(st <= sequence.length && ed <=sequence.length) {
        	if(sum < k) {
        		if(ed == sequence.length) break; 
        		sum += sequence[ed++];
        	}else if( sum > k) {
        		sum -= sequence[st++];
        	}else {
//        		System.out.println(st + " " + ed);
        		
        		if(ed-st < min) {
        			min = ed-st;
        			int[] temp = {st, ed-1}; 
        			answer = temp;
        		}
        		
        		if(ed <= sequence.length-1) {
        			sum += sequence[ed++];
        		}else {
        			break;
        		}
        	}
        }

        return answer;
    }

}
