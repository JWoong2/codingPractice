package 프로그래머스.연습문제.레벨2.광물캐기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	 static class Rank {
			public int diamondCost;
			public int ironCost;
			public int stoneCost;
			
			public Rank(int diamondCost, int ironCost, int stoneCost) {
				super();
				this.diamondCost = diamondCost;
				this.ironCost = ironCost;
				this.stoneCost = stoneCost;
			}
		}
	
	public static void main(String[] args) {
		int[] picks = {1, 3, 2}; // dia, iron, stone	
		String[] minerals = {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"};
		//result : 12
		
		int[] picks2 = {0, 1, 1};
		String[] minerals2 = {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};	
		//result : 50
		
		System.out.println(solution(picks, minerals));
		System.out.println(solution(picks2, minerals2));
	}
	
	public static int solution(int[] picks, String[] minerals) {
		int answer = 0;
		List<Rank> list = new ArrayList<Rank>();
		
		int[][] costArray = {
				{1, 1, 1},
				{5, 1, 1,},
				{25, 5, 1}
		};
		
		int[] mineralsIndex = new int[minerals.length];
		for(int i=0; i<minerals.length; i++) {
			switch (minerals[i]) {
			case "diamond":
				mineralsIndex[i] = 0;
				break;
			case "iron":
				mineralsIndex[i] = 1;
				break;
			case "stone":
				mineralsIndex[i] = 2;
				break;
			}
		}
		
		int index = 0;
		int picksCount = picks[0] + picks[1] + picks[2];
		
		while(picksCount > 0) {
			int diamondCost = 0;
			int ironCost = 0;
			int stoneCost = 0;
			
			for(int i=0; i<5; i++) {
				if(index + i >= mineralsIndex.length) {
					break;
				}
				
				diamondCost += costArray[0][mineralsIndex[index + i]];
				ironCost += costArray[1][mineralsIndex[index + i]];
				stoneCost += costArray[2][mineralsIndex[index + i]];
			}
			
			picksCount--;
			index += 5;
			list.add(new Rank(diamondCost, ironCost, stoneCost));
		}
		
	   // 2) 모든 코스트의 합을 기준으로 내림차순 정렬
		Collections.sort(list, ((o1, o2) -> (o2.stoneCost - o1.stoneCost)));        
		
		for(Rank r : list) {
			if(picks[0] > 0) {
				picks[0]--;
				answer +=  r.diamondCost;
			}else if(picks[1] >0 ) {
				picks[1]--;
				answer +=  r.ironCost;
			}else if( picks[2] > 0 ) {
				picks[1]--;
				answer +=  r.stoneCost;
			}
			
		}
		
		return answer;
	}
}
