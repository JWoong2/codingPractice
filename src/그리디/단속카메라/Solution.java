package �׸���.�ܼ�ī�޶�;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int ans = solution(new int[][] {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}});
		System.out.println(ans);
	}
	
    public static int solution(int[][] routes) {
        int answer = 0;
        int min = Integer.MIN_VALUE;
        
        //2���� �迭�� �������ٶ�, ���� ������ ����ִ� �κ� ���� 0�Ǻκ��� �� ���ϰ�ʹٸ� if else �� ����ϸ� �ȴ�.
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        
        for(int i=0; i<routes.length; i++ ) { 
        	for(int j=0; j<routes[i].length; j++) {
        		System.out.print(routes[i][j] + " ");
        	}
        	System.out.println();
        }
        
        for(int[] route : routes) {
        	if(min < route[0]) {
        		min = route[1];
        		answer++;
        	}
        }
        
        return answer;
    }
}