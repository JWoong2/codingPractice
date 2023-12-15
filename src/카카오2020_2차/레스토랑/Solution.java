package Ä«Ä«¿À2020_2Â÷.·¹½ºÅä¶û;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class StrCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}
	
}

class Solution {
	public static void main(String[] args) {
		String[] test = {"XYZ", "XWY", "WXA"};
		Arrays.sort(test, new StrCompare());
		int[] containCount = new int[test.length];
		
		Set<String> set = new HashSet<>();
		
		for(int i=0; i<test.length; i++) {
			for(int j = 0 ; j<test.length; j++) {
				if(test[i].contains(test[j]) && i != j) {
					containCount[i]++;
					System.out.println(test[i] + " ¸ÅÄª " + test[j]);
					set.add(test[j]);
				}
			}
		}
		
		String[] answer = set.toArray(new String[set.size()]);
		Arrays.sort(answer);
		
		
		for(String s : answer) {
			System.out.println(s);
		}
		
		String[] ans = solution(test, new int[]{2,3,4});
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
		
	
    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        
        
        
        return answer;
    }
}