package ���α׷��ӽ�.��������.����0.��ȣ�ص�;

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
