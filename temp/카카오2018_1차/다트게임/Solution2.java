package 카카오2018_1차.다트게임;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] example = { "1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*" };
		int[] arr = new int[example.length];

		for (int i = 0; i < example.length; i++) {
			arr[i] = solution(example[i]);
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int solution(String dartResult) {
		int answer = 0;
		int total = 0;
		String tempNum ="";
		for (char c : dartResult.toCharArray()) {
			if (Character.isDigit(c)) {
				tempNum += c;
			} else {
				if (!tempNum.isEmpty()) { //1D2S3T* ex 59 rea 60 
					answer = Integer.parseInt(tempNum);
					tempNum = "";
				}
				switch (c) {
				case 'S':
					answer = (int) Math.pow(answer , 1);
					total+=answer;
					break;
				case 'D':
					answer = (int) Math.pow(answer, 2);
					total+=answer;
					break;
				case 'T':
					answer = (int) Math.pow(answer, 3);
					total+=answer;
					break;
				case '*':
					//각 지금과 전까지의 score를 2배해줘야하는데 
					//나는 그냐 ㅇ토탈을 두배해줘서 잘못된거다 ~ 이말이야
					total*=2;
					break;
				case '#':
					total-=answer;
					answer = answer*-1;
					System.out.println(answer);
					total+=answer;
					break;
				}

			}
		}
		return total;
	}
}
