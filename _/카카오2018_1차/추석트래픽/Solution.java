package _.카카오2018_1차.추석트래픽;

import java.text.SimpleDateFormat;

class Solution {
	public static void main(String[] args) {
        System.out.println(solution(new String[]{"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"}));
        System.out.println(solution(new String[]{"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"}));
        System.out.println(solution(new String[]{"2016-09-15 20:59:57.421 0.351s"
                , "2016-09-15 20:59:58.233 1.181s", "2016-09-15 20:59:58.299 0.8s"
                , "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s"
                , "2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s"
                , "2016-09-15 21:00:00.748 2.31s", "2016-09-15 21:00:00.966 0.381s"
                , "2016-09-15 21:00:02.066 2.62s"}));
    }

	
    public static int solution(String[] lines) {
        int answer = 0;
        
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for(String s : lines) {
        	String[] arr = s.split(" ");
        	
        	
        }
        
        
        return answer;
    }
}