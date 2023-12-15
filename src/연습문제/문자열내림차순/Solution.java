package 연습문제.문자열내림차순;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		String ans = solution("Zbcdefg");
		System.out.println(ans);
		
		String wer = test("Zbcdefg");
		System.out.println(wer);
	}
    public static String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new StringBuilder(new String(ch)).reverse().toString();
    }
    
    private static String test(String s) {
    	int strSize = s.length();
    	
    	String answer = "";
    	
    	for(int i=strSize-1; i>=0; i--) {
    		answer+=s.charAt(i);
    	}
    	
    	return answer;
    }
}