package 카카오2020_2차.아이디생성방침;

public class Solution {
	public static void main(String[] args) {
		String ans = solution("...!@BaT#*..y.abcdefghijklm");
		System.out.println(ans);
	}
	
	public static String solution(String new_id) {
		String answer = "";

		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z[._-]\\s]";
		new_id = new_id.replaceAll(match, "").replace("...",".").replace("..", ".").toLowerCase();
		
		while(new_id.matches("...") || new_id.matches("..")) {
			new_id = new_id.replace("...",".").replace("..", ".");
		}
		
		if(new_id.length() ==0 ) {
			while (new_id.length() != 3) {
				new_id += "a";
			}
		}else if (new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		while (new_id.length() < 3) {
				new_id += "a";
			}
		}else if (new_id.length() > 0 && new_id.length() < 3) {
			 System.out.println("before : " +new_id);
		}
        
		if( new_id.length() >= 15) {
			new_id = new_id.substring(0, 15);
			System.out.println(new_id.charAt(14));
		System.out.println(new_id);
			if(new_id.charAt(14) == '.') {
				new_id = new_id.substring(0, 14);
			}
		}
        
        if(new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0, new_id.length()-1);
			
			while(new_id.length() <3) {
				new_id += new_id.charAt(new_id.length()-1);	
			}
		}
		answer = new_id;
		
		return answer;
	}
}
