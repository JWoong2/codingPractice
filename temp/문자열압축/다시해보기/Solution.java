package 문자열압축.다시해보기;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringPack = { "aabbaccc", "ababcdcdababcdcd"
				, "abcabcdede", 
				"abcabcabcabcdededededede",
				"xababcdcdababcdcd"};
		
		for(String s : stringPack) {
			System.out.println(solution(s));
		}
		
	}

    public static int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int len = 1 ; len < s.length() ; len++){            
            String compressed = "";
            String target = "";
            String current = "";
            int cnt = 1;
            
            // 첫 번쨰 단위 지정
            for(int i = 0 ; i < len ; ++i) {
            	target += s.charAt(i);
            }
            
            // 단위만큼 잘랐을 때 각 부분의 시작 인덱스
            for(int i = len ; i < s.length() ; i += len){
                current = "";
                for(int j = i ; j < i + len ; ++j){
                	if(j >= s.length()) break;
                    current += s.charAt(j);
                }
                
                if(target.equals(current)){
                    cnt++;
                } else {
                    if(cnt > 1){
                        compressed += cnt + target;
                    } else {
                        compressed += target;
                    }
                    cnt = 1;
                    target = current;
                }
            }
            
            if(cnt > 1){
                compressed += cnt + target;
            } else {
                compressed += target;
            }
            
            int length = compressed.length();
            answer = answer > length ? length : answer;
        }
        
        if(answer == Integer.MAX_VALUE) answer = 1;
        
        return answer;
    }
}