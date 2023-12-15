package _Dev_matching.네방향알파벳;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		String[] buttons = {
				"v>AB^CYv^XA","<v>A","^XAZ","Yv^XA",">AB^"
		};
		
		int a = solution("<v>AB^CYv^XAZ", buttons, new int[] {50, 18, 20, 30, 25});
		System.out.println(a);
	}
	
    public static int solution(String command, String[] buttons, int[] scores) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        List<Integer> score = new ArrayList<>();
        List<Integer> answers = new ArrayList<>();
        
        for(int i=0; i<buttons.length; i++) {
        	if(buttons[i].length() < scores[i]) {
        		list.add(buttons[i]);
        		score.add(scores[i]);
        	}
        }
        
        boolean complete = false;
        
        for(int i=0; i<command.length(); i++) {
        	for(int j=0; j<list.size(); j++) {
        		
        		if(command.charAt(i) == list.get(j).charAt(0)) {
        			for(int a=i; a<list.get(j).length(); a++) {
        				System.out.println(" c : "  + command.charAt(a));
    					System.out.println(" c : "  + list.get(j).charAt(a));
    					System.out.println(a);
        				if(command.charAt(a) != list.get(j).charAt(a)) {
        					complete = false;
        					break;
        				} else complete = true;
        			}
        			if(complete) {
        				System.out.println("i : " + j);
        				answers.add(score.get(j));
        			}
        		}
        		
        	}
        	answer += 1;
        }
        
        for(int i : answers) {
        	System.out.println(i);
        }
        
        return answer;
    }
}