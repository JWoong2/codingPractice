package 프로그래머스_스쿨.파트2.전화번호목록;

class Solution {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"119", "97674223", "1195524421"}));
	}
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++) {
        	if(answer) {
        		for(int j=0; j<phone_book.length; j++) {
        			if(i == j) continue;
            		if(phone_book[i].startsWith(phone_book[j])) {
            			answer = false;
            			break;
            		}
            	}	
        	}
        }
        
        return answer;
    }
}