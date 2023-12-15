package 프로그래머스.스쿨.나머지한점;

import java.util.ArrayList;

class Solution {
	public static void main(String[] args) {
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		
		int[] answer = solution(v);
		
		for(int i=0; i<answer.length ; i++) {
			System.out.println(answer[i]);
		}
	}
	
	
    public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        
        
        for(int i=0; i<v.length; i++) {
        	if(!first.contains(v[i][0])) {
        		first.add(v[i][0]);
        	}else if(first.contains(v[i][0])){
        		// first.remove(v[i][0]);
        		first.remove(first.indexOf(v[i][0]));
        	}
        	
        	if(!second.contains(v[i][1])) {
        		second.add(v[i][1]);
        	}else if(second.contains(v[i][1])) {
        		// second.remove(v[i][1]);
        		second.remove(second.indexOf(v[i][1]));
        	}
        }
        
        System.out.println(first.get(0));
        System.out.println(second.get(0));
        
        answer[0] = first.get(0);
        answer[1] = second.get(0);

        return answer;
    }
}