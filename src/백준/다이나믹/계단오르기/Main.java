package 백준.다이나믹.계단오르기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalFloor = sc.nextInt();
		
		int[] floorScore = new int[totalFloor+1];
		int[] maxScore = new int[totalFloor+1];
		
		for (int i = 1; i < floorScore.length; i++) {
			floorScore[i] = sc.nextInt();
		}
		
		if(totalFloor==1 ) {
			maxScore[1] = floorScore[1];	
		}else if( totalFloor==2 ) {
			maxScore[1] = floorScore[1];
			maxScore[2] = floorScore[2] + floorScore[1];	
		}else if( totalFloor==3 ) {
			maxScore[1] = floorScore[1];
			maxScore[2] = floorScore[2] + floorScore[1];
			maxScore[3] = Math.max(floorScore[1]+ floorScore[3], floorScore[2]+floorScore[3]);
		}else {
			maxScore[1] = floorScore[1];
			maxScore[2] = floorScore[2] + floorScore[1];
			maxScore[3] = Math.max(floorScore[1]+ floorScore[3], floorScore[2]+floorScore[3]);
			
			for(int i=4; i<=totalFloor; i++) {
				maxScore[i] = Math.max(maxScore[i-3]+ floorScore[i]+floorScore[i-1], maxScore[i-2] + floorScore[i]);
			}	
		}
		
		
		System.out.println(maxScore[totalFloor]);
	}
}
