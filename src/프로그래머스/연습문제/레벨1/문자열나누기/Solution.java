package 프로그래머스.연습문제.레벨1.문자열나누기;

public class Solution {
	public static void main(String[] args) {
		String s = "abracadabra";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        int answer = 0;
        
        char[] charArray = s.toCharArray();
        
        for(int i=0; i<charArray.length; i++) {
        	char x = charArray[i];
        	
        	int countX = 0;
        	int countNonX = 0;
        	
        	for(int j=i+1; j<charArray.length; j++) {
        		if(x == charArray[j]) {
        			countX++;
        		}else {
        			countNonX++;
        		}
        	}
        	
        	System.out.println();
        	
        	if(countX == countNonX) answer++;
        }
        
        return answer;
    }
}
