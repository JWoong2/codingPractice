package 연습문제.JadenCase;

class Main {
	public static void main(String[] args) {
		String ans = solution("3people unFollowed me");
		System.out.println(ans);
	}
	
    public static String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        boolean isAlpha = false;
        
        for(char c : s.toCharArray()){
        	if(Character.isAlphabetic(c) || Character.isDigit(c)) {
        		if(!Character.isDigit(c) && !isAlpha) answer += (char) (c - 32); 
        		else answer += c;
        		
        		isAlpha = true;        		
        	}else {
        		isAlpha = false;
        		answer += c;
        	}
        }
        
        return answer;
    }
}