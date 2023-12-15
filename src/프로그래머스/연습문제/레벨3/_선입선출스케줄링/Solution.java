package 프로그래머스.연습문제.레벨3._선입선출스케줄링;

class Solution {
	public static void main(String[] args) {
		int ans = solution(6, new int[] {1,2,3});
		System.out.println(ans);
	}
	
    public static int solution(int n, int[] cores) {
         int cnt = 0;
        while(true){
            for(int i = 0 ; i < cores.length ; i++){
                if(cnt % cores[i] == 0 && --n == 0) return i+1;
            }
            cnt++;
        }
    }
}