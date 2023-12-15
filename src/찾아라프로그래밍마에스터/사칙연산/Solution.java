package 찾아라프로그래밍마에스터.사칙연산;

class Solution {
	public int solution(String arr[]) {
		int answer = 1;

		int minusCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("-"))
				minusCount++;
		}

		int sum = 0;
		boolean plus_minus = true;
		
		if (minusCount % 2 == 0) {
		}else {
			for(int i=0; i<arr.length; i++) {
				if(Character.isDigit(arr[i].charAt(i))) {
					if(plus_minus) {
						sum += Integer.parseInt(arr[i]);	
					}else {
						sum -= Integer.parseInt(arr[i]);
					}
				}else {
					
				}
			}
		}

		return answer;
	}
}