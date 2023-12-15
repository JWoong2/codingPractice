package 프로그래머스.스쿨.순열검사;

/*
 * 런타임 오류
 * 제한사항
	배열의 길이는 10만 이하입니다.
	배열의 원소는 0 이상 10만 이하인 정수입니다.
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