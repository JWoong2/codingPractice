package �׸���.���̽�ƽ;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int a = solution("JEROEN"); System.out.println(a); */
		  int a = solution("BBBBAAAAABBB"); System.out.println(a);
		
		int b = solution("JAZ");
		System.out.println(b);
	}
	
	public static int solution(String name) {
        int answer = 0;
        
        //�ּ��� ��ȯ
        for(int i = 0; i<name.length(); i++) {
        	if(name.charAt(i) != 'A' ) {
        		int up = name.charAt(i) - 'A';
        		int down = 1+ 'Z' - name.charAt(i);
        		answer += (up< down) ? up : down;
        	}
        }
        

        int minMove = name.length() -1;
        
        //�ּ��� ������        
        for(int i = 0; i<name.length(); i++) {
        	if(name.charAt(i) != 'A') {
        		int next = i+1;
        		while(next<name.length() && name.charAt(next) == 'A' ) {
        			next++;
        		}
        		System.out.println(i + "�϶� next : " + next);
        		int move = 2*i + name.length() - next;
        		System.out.println(name.charAt(i) + "�϶� move : " + move);
        		minMove = Math.min(move, minMove);
        	}
        }
        return answer + minMove;
    }
}