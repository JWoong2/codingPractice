package ����.������ȹ��.����������ϴºκм���4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n + 1];
        int dp[] = new int[n + 1];
        // ���� ������ �ּڰ��� 1�̱� ������
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        // dp�迭 �ʱ�ȭ
        for(int i = 1; i <= n; i++){
            int num = Integer.parseInt(st.nextToken());
            // �Էµ� �迭 �� ����
            arr[i] = num;
            // �Էµ� �迭 ���� ������ ������ ���Ѵ�.
            for(int j = 0 ; j < i; j++){
                // ���� ������ ū���
                if(arr[i] > arr[j]){
                   // ���� ���� dp�� + 1, ������ dp�� �� ū ���� �����Ѵ�.
                   dp[i] = Math.max(dp[j] + 1, dp[i]);
                   // ���� ������ ���� ���ϱ� ���ؼ� result����
                   // ���ݱ��� ���� dp�� �� ���� ū ���� �����Ѵ�.
                   result = Math.max(dp[i], result);
                }
            }
        }
        // ������� �߰�
        sb.append(result + "\n");

        // ���� ���� ��
        int value = result;
        // ��θ� ������ �� stack
        Stack<Integer> stack = new Stack<>();

        // value�� ���� ã�� ���̿� �ش��ϴ� ���̴�.
        for(int i = n; i >= 1; i--){
            // ���� ã�� ���̿� ���� ���
            if(value == dp[i]) {
                // stack�� ���� ���� push�Ѵ�.
                stack.push(arr[i]);
                // ã�� ���̸� ã�����Ƿ� -1�� ���־�
                // ������ ã�� ���̸� �������ش�.
                value--;
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop() + " ");
        }

        // ��� ���ۿ� write �۾��� �Ѵ�.
        bw.write(sb.toString());

        bw.close();
        br.close();
     }
}

