package ���α׷��ӽ�.����.�����˻�;

/*
 * ��Ÿ�� ����
 * ���ѻ���
	�迭�� ���̴� 10�� �����Դϴ�.
	�迭�� ���Ҵ� 0 �̻� 10�� ������ �����Դϴ�.
 */

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;

        boolean[] visited = new boolean[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr.length) {
                return false;
            }
            visited[arr[i] -1] = true;
        }
        
        for(int i=0; i<arr.length; i++) {
            if( visited[i] != true ) {
                
                return false;
            }
        }
        
        return answer;
    }
}