package 프로그래머스.연습문제.레벨0.암호해독;

public class Solution {
	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk"; // dfjardstddetckdaccccdegk
		int code = 2; // 4 
		
		System.out.println(solution(cipher, code)); 
	}
	
	public static String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = code; i<= cipher.length(); i+=code) {
        	answer += cipher.charAt(i-1);
        }
        
        return answer;
    }
}
