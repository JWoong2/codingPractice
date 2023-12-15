package _스킬테스트.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class lengthSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
}

class Solution {
	public static void main(String[] args) {
		int[] ans = solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static int[] solution(String s) {
		String[] c = s.split("},");

		for (int i = 0; i<c.length; i++) {
			c[i] = c[i].replace("{", "").replace("}", "");
			System.out.println(c[i]);
		}

		List<String> list = new ArrayList<String>();
		Arrays.sort(c, new lengthSort());
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
			String[] arr = c[i].split(",");
			
			for(String t : arr) {
				if(!list.contains(t)) {
					list.add(t);
				}
			}
		}
		
		int[] answer = new int[list.size()];

		for(int i=0; i<list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}
		
		return answer;
	}
}