package 프로그래머스.스쿨.나머지한점;

/* 강의 */

//#include <iostream>
//#include <vector>
//using namespace std;
//
//vector<int> solution(vector<vector<int> > v) {
//    vector<int> ans = {0,0};
//    for(int i=0; i<3; i++)
//    {
//        ans[0] ^= v[i][0];
//        ans[1] ^= v[i][1];
//    }
//    return ans;
//}

class Solution1 {
	public static void main(String[] args) {
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		
		int[] answer = solution(v);
		
		for(int i=0; i<answer.length ; i++) {
			System.out.println(answer[i]);
		}
	}
	
	
    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        for(int i=0; i<3; i++) {
        	answer[0] ^= v[i][0];
        	answer[1] ^= v[i][1];
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        
        return answer;
    }
}