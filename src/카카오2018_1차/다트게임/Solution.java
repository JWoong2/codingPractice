package 카카오2018_1차.다트게임;

public class Solution {

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
		int[] arr = new int[3]; //3번의 게임
		int curIdx = 0; 

		String tempNum ="";
		for (char c : dartResult.toCharArray()) {
			if (Character.isDigit(c)) {
				tempNum += c;
			} else {
				if (!tempNum.isEmpty()) {
					arr[curIdx++] = Integer.parseInt(tempNum);
					tempNum = "";
				}
				switch (c) {
				case 'S':
					arr[curIdx - 1] = (int) Math.pow(arr[curIdx - 1], 1);
					break;
				case 'D':
					arr[curIdx - 1] = (int) Math.pow(arr[curIdx - 1], 2);
					break;
				case 'T':
					arr[curIdx - 1] = (int) Math.pow(arr[curIdx - 1], 3);
					break;
				case '*':
					arr[curIdx - 1] = arr[curIdx - 1] * 2;
					if (curIdx - 2 >= 0)
						arr[curIdx - 2] = arr[curIdx - 2] * 2;
					break;
				case '#':
					arr[curIdx - 1] = arr[curIdx - 1] * -1;
					break;
				}

			}
		}

		return arr[0] + arr[1] + arr[2];
	}
}
