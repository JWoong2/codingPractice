package 프로그래머스.연습문제.레벨2.최대값최소값;

class Solution {
	public static void main(String[] args) {
		String s = "1 2 3 4";
		String s2 = "-1 -2 -3 -4";
		
		System.out.println(solution(s2));
	}
	
    public static String solution(String s) {
        String answer = "";
        
        String[] splitWord = s.split(" ");
        
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        
        for(int i=0; i<splitWord.length; i++) {
        	System.out.println( Integer.parseInt(splitWord[i]) );
        	
        	maxNum = Math.max(maxNum, Integer.parseInt(splitWord[i]));
        	minNum = Math.min(minNum, Integer.parseInt(splitWord[i]));
        }
        
        answer += minNum;
        answer += " " + maxNum;
        
        return answer;
    }
}