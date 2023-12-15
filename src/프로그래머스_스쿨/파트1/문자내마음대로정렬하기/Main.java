package 프로그래머스_스쿨.파트1.문자내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

class Main {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {

			public int compare(String o1, String o2) {
				if (o1.charAt(n) > o2.charAt(n))
					return o1.charAt(n) - o2.charAt(n);
				else if (o1.charAt(n) < o2.charAt(n))
					return o1.charAt(n) - o2.charAt(n);
				else
					return o1.compareTo(o2);
			}
		});

		return strings;
	}
}