package 연습문제.JadenCase;

class Solution {
	public static void main(String[] args) {
		String ans = solution("for       the         last           week");
		System.out.println(ans);
	}
	
    public static String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        //문자 자르는 방식을 다르게
        boolean space = false;
        String str = "";
        
        for(char c : s.toCharArray()){
        	if(Character.isAlphabetic(c)) {
        		space = false;
        		str += c;
        	}else {
        		if(!space) str += c;
        		space = true;
        	}
        }
        
        String[] splitWord = str.split(" ");
        
        for(int i=0; i<splitWord.length; i++) {
        	if(Character.isAlphabetic(splitWord[i].charAt(0))) {
        		splitWord[i] = splitWord[i].replace(splitWord[i].charAt(0), (char) (splitWord[i].charAt(0) - 32));
        	}
        }
        
        for(int i=0; i<splitWord.length; i++) {
        	if( i == splitWord.length -1) {
        		answer += splitWord[i];
        	}else {
        		answer += splitWord[i] + " ";	
        	}
        	
        }
        
        return answer;
    }
}