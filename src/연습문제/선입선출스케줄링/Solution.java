package 연습문제.선입선출스케줄링;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int ans = solution(7, new int[] {1,2,3});
		System.out.println(ans);
	}
	
	 public static int solution(int n, int[] cores) {
	        int answer = 0;
	        int min = 10001;
	        if(n <= cores.length) {
	            return n;
	        }
	        
	        min = Arrays.stream(cores).min().getAsInt();

	        int minTime = n * min / cores.length; // 2
	        int maxTime = n * min; // 6
	        int midTime = (minTime + maxTime) / 2; // 4

	        while(minTime < maxTime) { 
	            int count = 0;
	            int availableCount = 0;

	            for(int i : cores) {
	                count += (midTime / i) + 1;
	                if(midTime % i == 0) {
	                    availableCount++;
	                    count--;
	                }
	            }

	            if(count >= n) {
	                maxTime = midTime;
	            } else if(count + availableCount < n) {
	                minTime = midTime+1;
	            } else {
	                for(int i = 0; i < cores.length; i++) {
	                    if(midTime % cores[i] == 0) {
	                        count++;
	                    }

	                    if(count == n) {
	                        return i+1;
	                    }
	                }
	            }

	            midTime = (minTime + maxTime) / 2;
	        }

	        return answer;
	    }
}
