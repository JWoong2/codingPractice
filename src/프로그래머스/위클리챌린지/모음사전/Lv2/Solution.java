package 프로그래머스.위클리챌린지.모음사전.Lv2;

class Solution {
	   public int solution(String word) {
	        // 입력되는 word의 길이부터 시작해서 계산하자
	        int answer = word.length();
	        
	        String str = "AEIOU";
	        int[] x = {781, 156, 31, 6, 1};
	        
	        for (int i=0; i<word.length(); i++) {
	            int idx = str.indexOf(word.charAt(i));
	            answer += x[i] * idx;
	            System.out.println(answer);
	        }
	        
	        return answer;
	    }
}