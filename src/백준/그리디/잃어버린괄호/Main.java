package 백준.그리디.잃어버린괄호;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String exp = sc.nextLine();

		// "(?<=\\D)(?=\\d)"
		// "\\s*[0-9]+"
		// "(?<=[0-9])(?=\\d)"
		String[] part = exp.split("(?<=\\d)(?=\\D)");
		boolean isMinus = false;
		int answer = 0;
		int temp = 0;

		for (String s : part) {
			if (s.charAt(0) == '-') {
				isMinus = !isMinus;
				temp = Integer.parseInt(s);
			} else if (s.charAt(0) == '+') {
				if (isMinus) {
					temp -= Integer.parseInt(s);
				} else {
					answer += Integer.parseInt(s);
				}
			} else {
				answer = Integer.parseInt(s);
			}
		}

		System.out.println(answer + temp);
	}
}
