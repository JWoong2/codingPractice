package 프로그래머스.위클리챌린지.부족한금액채우기.Lv1;

class Solution {
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		// 1 3   17
		// 2 6   11
		// 3 9   2
		// 4 12  -10
		
		long answer = solution(price, money, count);
		
		System.out.println(answer);
	}
	
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long temp = money;
        
        for(int i=1; i<=count; i++) {
        	temp -= price * i;
        }
        
        if(temp < 0) {
        	answer = Math.abs(temp);
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}