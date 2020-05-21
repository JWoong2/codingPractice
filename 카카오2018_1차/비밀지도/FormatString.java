package 카카오2018_1차.비밀지도;

public class FormatString {
	public static void main(String[] args) {
		String[] a = solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10});
		
		for(String s : a) {
			System.out.println(s);
		}
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(String.format("%12s", result[i]));
			result[i] = String.format("%" + n + "s", result[i]);
			
			
			result[i] = result[i].replaceAll("1", "#");
			result[i] = result[i].replaceAll("0", " ");
		}

		return result;
	}
}
