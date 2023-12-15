package _��ų�׽�Ʈ.�ּҰ�����;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		
	}
	
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        
        Integer[] what = Arrays.stream( B ).boxed().toArray( Integer[]::new );
        Arrays.sort(what, Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++) {
        	answer += A[i]*what[i];
        }
                
        return answer;
    }
}
