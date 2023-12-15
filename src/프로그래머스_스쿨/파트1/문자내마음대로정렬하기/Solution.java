package 프로그래머스_스쿨.파트1.문자내마음대로정렬하기;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public static void main(String[] args) {
		String[] testCase1 = {"sun", "bed", "car"};
		String[] testCase2 = {"abce", "abcd", "cdx"};
		String[] answers = solution(testCase1, 1);
		
		for(String s : answers) {
			System.out.println(s);
		}
	}
	
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				}else {
					return o1.charAt(n) - o2.charAt(n);	
				}
			}
		});
        
        return strings;
    }
}