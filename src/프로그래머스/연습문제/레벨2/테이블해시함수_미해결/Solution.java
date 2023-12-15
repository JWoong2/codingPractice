package 프로그래머스.연습문제.레벨2.테이블해시함수_미해결;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[][] data =
				{{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
				
		int col = 2;
		int row_begin = 2;
		int row_end = 3;
		
		System.out.println(solution(data, col, row_begin, row_end));
	}
	
	public static int solution(int[][] data, int col, int row_begin, int row_end) {
		int answer = 0;

		//2차월 배열 정렬 0번쨰 열 다음 1번째 열 기준(다중 배열 정렬)
		Arrays.sort(data, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[col-1] == o2[col-1]) {
	                	 return o2[0] - o1[0];
		    	 }else {
		    		 return o1[col-1] - o2[col-1]; 
		    	 }
	           }
	        });
		
		List<Integer> modList = new ArrayList<>();
		
		for(int i=row_begin-1; i<=row_end-1; i++) {
			// 나머지값들을 저장하는 값
			int tempMod =0;
			
			for(int j=0; j<3; j++) {
				tempMod += data[i][j] % (i+1);
			}
			
			modList.add(tempMod);
		}
		
		answer = modList.get(0);
		
		for(int i=1; i<modList.size(); i++) {
			answer ^= modList.get(i);
		}

		return answer ;
	}
}