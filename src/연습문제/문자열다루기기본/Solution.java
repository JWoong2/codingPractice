package 연습문제.문자열다루기기본;

class Solution {
	public static void main(String[] args) {
		boolean chk = solution("a234");
		System.out.println(chk);
	}
	
    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
        	for(char c : s.toCharArray()) {
        		if(Character.isLetter(c)) return false;
        	}
        	return true;
        }else {
        	return false;
        }
    }
}