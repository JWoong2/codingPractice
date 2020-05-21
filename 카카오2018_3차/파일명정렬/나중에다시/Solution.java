package 카카오2018_3차.파일명정렬.나중에다시;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		String[] test = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		String[] a = solution(files);
		for(String s : a) {
			System.out.println(s);
		}
	}
	
    public static String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>(){
        	@Override
        	public int compare(String o1, String o2) {
        		// TODO Auto-generated method stub
        		String head1 = o1.split("[0-9]")[0];
        		o1 = o1.replace(head1, "");
        		head1 = head1.toUpperCase();
        		
        		String tempNum = "";
        		for(char c : o1.toCharArray()) {
        			if(Character.isDigit(c) && tempNum.length() < 5) {
        				tempNum += c;
        				
        			}else {
        				break;
        			}
        		}
        		int num1 = Integer.parseInt(tempNum);
        		
        		String head2 = o2.split("[0-9]")[0];
        		o2 = o2.replace(head2,  "");
        		head2 = head2.toUpperCase();
        		
        		tempNum = "";
        		for(char c : o2.toCharArray()) {
        			if(Character.isDigit(c) && tempNum.length() < 5) {
        				tempNum += c;
        				
        			}else {
        				break;
        			}
        		}
        		int num2 = Integer.parseInt(tempNum);
        		return head1.equals(head2) ? num1 - num2 : head1.compareTo(head2);
        	}
		});
        
        return files;
    }
}