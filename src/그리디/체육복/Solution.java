package �׸���.ü����;

public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int[] s = new int[n];
        for(int i =0; i<n; i++) s[i] =1; // �ִ� ü����
        for(int l : lost ) s[l-1] -= 1; // �нǵ� ü����
        for(int r : reserve) s[r-1] += 1; // ���� ������ �ִ� �����
        
        for(int i =0; i<n; i++) {
        	if(s[i] == 0 ) {
        		//�տ� �ִ� ������� ������
        		if(i >0 && s[i-1]> 1) {
        			s[i-1] -= 1;
            		s[i] += 1;	
        		}
        		
        		//�ڿ� �ִ� ������� ������
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