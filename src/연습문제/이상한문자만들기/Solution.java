package 연습문제.이상한문자만들기;

class Solution {
	public static void main(String[] args) {
		String ans = solution("try hello world");
		System.out.println(ans);
	}
	public static String solution(String s) {
		String answer = "";
		String[] test = s.split(" ");
		
		for(String d : test) {
			for(int i=0; i<d.length(); i++) {
				if(i%2 ==0) {
					char a = (char) (d.charAt(i)- 32);
					answer += a;
				} else {
					answer += d.charAt(i);
				}	
			}
			answer += " ";
		}
		
		return answer;
	}
}