package 재귀.종이접기;

public class Solution2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = solution(3);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int n) {
		if(n ==1 ) return new int[] {0};
		int[] temp = solution(n -1);
		int[] answer = new int[temp.length*2 +1];
		
		for(int i = 0; i<answer.length; i++) {
			if(i<temp.length) answer[i] = temp[i];
			else if(i == temp.length) answer[i] =0;
			else answer[i] = temp[answer.length -1 -i] == 1 ? 0 : 1;
		}
		
		return answer;
	}
}