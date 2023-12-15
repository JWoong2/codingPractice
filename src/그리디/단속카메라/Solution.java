package 그리디.단속카메라;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int ans = solution(new int[][] {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}});
		System.out.println(ans);
	}
	
    public static int solution(int[][] routes) {
        int answer = 0;
        int min = Integer.MIN_VALUE;
        
        //2차원 배열을 정렬해줄땐, 정렬 기준을 잡아주는 부분 만약 0의부분을 더 비교하고싶다면 if else 를 사용하면 된다.
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