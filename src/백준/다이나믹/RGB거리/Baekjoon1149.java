package ����.���̳���.RGB�Ÿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1149 {
	 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] colorCost = new int[1000][3]; // ������ ���� ���� ����Ʈ ���
        int[][] sumColorCost = new int[1000][3]; // ��� ���� ���� ����Ʈ ��� �ּڰ�
        
        for(int i=0; i<n; i++) { // ������ ���� ���� ����Ʈ ����� �Է�.
            String[] preInputArray = br.readLine().split(" ");
            int[] inputArray = new int[3];
            for(int j=0; j<preInputArray.length; j++) {
                inputArray[j] = Integer.parseInt(preInputArray[j]);
            }
            colorCost[i][0] = inputArray[0]; // ���� ����Ʈ ���
            colorCost[i][1] = inputArray[1]; // �ʷ� ����Ʈ ���
            colorCost[i][2] = inputArray[2]; // �Ķ� ����Ʈ ���
        }
        
        /* �ʱⰪ ���� */
        sumColorCost[0][0] = colorCost[0][0]; 
        sumColorCost[0][1] = colorCost[0][1];
        sumColorCost[0][2] = colorCost[0][2];
        
        for(int j=1; j<n; j++) {
            sumColorCost[j][0] = Math.min(sumColorCost[j-1][1], sumColorCost[j-1][2]) + colorCost[j][0]; // ������ ���� ���������� ���� �� �ּڰ�(�տ��� �ʷ� Ȥ�� �Ķ� ���� �� �ּҺ��)
            sumColorCost[j][1] = Math.min(sumColorCost[j-1][0], sumColorCost[j-1][2]) + colorCost[j][1]; // ������ ���� �ʷϻ����� ���� �� �ּڰ�(�տ��� ���� Ȥ�� �Ķ� ���� �� �ּҺ��)
            sumColorCost[j][2] = Math.min(sumColorCost[j-1][0], sumColorCost[j-1][1]) + colorCost[j][2]; // ������ ���� �Ķ������� ���� �� �ּڰ�(�տ��� ���� Ȥ��  ���� �� �ּҺ��)
        }
        
        int minColorCost = Math.min(sumColorCost[n-1][0], Math.min(sumColorCost[n-1][1], sumColorCost[n-1][2])); // �� ������ ����Ʈ �� ���� ������ �ּڰ����� ���.
        System.out.println(minColorCost);
    }
 
}
 
