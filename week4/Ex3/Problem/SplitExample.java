package week4.Ex3.Problem;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�, �̸�, �н�����";
		String[] s1 = str.split(", ");

		for (String s : s1) {
			System.out.println(s);
		}

		System.out.println();

		StringTokenizer st = new StringTokenizer(str, ", ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
