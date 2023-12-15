package 그리디.체육복;

public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int[] s = new int[n];
        for(int i =0; i<n; i++) s[i] =1; // 있던 체육복
        for(int l : lost ) s[l-1] -= 1; // 분실된 체육복
        for(int r : reserve) s[r-1] += 1; // 여벌 가지고 있는 사람들
        
        for(int i =0; i<n; i++) {
        	if(s[i] == 0 ) {
        		//앞에 있는 사람한테 빌리기
        		if(i >0 && s[i-1]> 1) {
        			s[i-1] -= 1;
            		s[i] += 1;	
        		}
        		
        		//뒤에 있는 사람한테 빌리기
        		else if(i < s.length-1 && s[i+1] > 1){
        			s[i+1] -= 1;
            		s[i] += 1;	
        		}
        	}
        }
        
		int answer = 0;
		for(int i = 0; i<n; i++) {
			if(s[i] > 0) answer++;
		}
		
        return answer;
    }
}