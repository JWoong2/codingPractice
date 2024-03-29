package 백준.다이나믹.RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1149 {
	 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] colorCost = new int[1000][3]; // 각각의 집에 대한 페인트 비용
        int[][] sumColorCost = new int[1000][3]; // 모든 집에 대한 페인트 비용 최솟값
        
        for(int i=0; i<n; i++) { // 각각의 집에 대한 페인트 비용을 입력.
            String[] preInputArray = br.readLine().split(" ");
            int[] inputArray = new int[3];
            for(int j=0; j<preInputArray.length; j++) {
                inputArray[j] = Integer.parseInt(preInputArray[j]);
            }
            colorCost[i][0] = inputArray[0]; // 빨간 페인트 비용
            colorCost[i][1] = inputArray[1]; // 초록 페인트 비용
            colorCost[i][2] = inputArray[2]; // 파랑 페인트 비용
        }
        
        /* 초기값 설정 */
        sumColorCost[0][0] = colorCost[0][0]; 
        sumColorCost[0][1] = colorCost[0][1];
        sumColorCost[0][2] = colorCost[0][2];
        
        for(int j=1; j<n; j++) {
            sumColorCost[j][0] = Math.min(sumColorCost[j-1][1], sumColorCost[j-1][2]) + colorCost[j][0]; // 마지막 집을 빨간색으로 했을 때 최솟값(앞에는 초록 혹은 파랑 집의 총 최소비용)
            sumColorCost[j][1] = Math.min(sumColorCost[j-1][0], sumColorCost[j-1][2]) + colorCost[j][1]; // 마지막 집을 초록색으로 했을 때 최솟값(앞에는 빨강 혹은 파랑 집의 총 최소비용)
            sumColorCost[j][2] = Math.min(sumColorCost[j-1][0], sumColorCost[j-1][1]) + colorCost[j][2]; // 마지막 집을 파란색으로 했을 때 최솟값(앞에는 빨강 혹은  집의 총 최소비용)
        }
        
        int minColorCost = Math.min(sumColorCost[n-1][0], Math.min(sumColorCost[n-1][1], sumColorCost[n-1][2])); // 총 세가지 페인트 중 가장 저렴한 최솟값으로 출력.
        System.out.println(minColorCost);
    }
 
}
 
