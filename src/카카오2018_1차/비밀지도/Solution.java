package 카카오2018_1차.비밀지도;

class Solution {
	public static void main(String[] args) {
		String[] a = solution(5, new int[] {30, 1, 21, 17, 28}, new int[] {0,0,0,0,0});
		
		for(String s : a) {
			System.out.println(s);
		}
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        int size = arr1.length;
        
        for(int i =0; i<arr1.length; i++) {
        	answer[i] = convert(size ,arr1[i] | arr2[i]);
        }
        
        return answer;
    }
    
    private static String convert(int size, int num) {
    	String s="";
    	
    	s = Integer.toBinaryString(num);
    	while(s.length() !=size) {
    		s= "0" + s;
    	}
    	
    	for(char c : s.toCharArray()) {
    		 s += (c=='1') ? "#" : " "; 
    	}
    	
    	return s.replaceAll("[0-9]", ""); 
    }
}