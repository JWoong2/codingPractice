package 프로그래머스_스쿨.파트1.다음큰숫자;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String a1 = Integer.toBinaryString(n);
        int count = 0;
        
        for(char c : a1.toCharArray()) {
        	if(c == '1') {
        		count++;
        	}
        }

        answer = getNumber(n, count);

        return answer;
    }
    
    private static int getNumber(int n, int cnt) {
    	int count = 0;
    	
    	while(count != cnt) {
    		n++;
    		count = 0;
    		String a1 = Integer.toBinaryString(n);
    		for(char c : a1.toCharArray()) {
    			if(c == '1') {
    				count++;
    			}
    			if(count > cnt) break;
    		}
    	}
    	
    	return n;
    }
}