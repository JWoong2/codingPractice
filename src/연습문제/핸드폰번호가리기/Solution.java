package 연습문제.핸드폰번호가리기;

public class Solution {
	   public static  String solution(String phone_number) {
	        int length = phone_number.length();
	        String answer = phone_number.substring(length-4, length);

			for(int i=0; i<length-4; i++) {
				answer = "*" + answer;
			}
			
	        return answer;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = solution("01033334444");
		System.out.println(s);
	}

}
