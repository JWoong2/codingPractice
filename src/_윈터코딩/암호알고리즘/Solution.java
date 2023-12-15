package _윈터코딩.암호알고리즘;

class Solution {
	public static void main(String[] args) {
		String ans = solution("qyyigoptvfb", "abcdefghijk", 3);

		System.out.println(ans);
	}

	public static String solution(String encrypted_text, String key, int rotation) {
		String answer = "";

		char[] key_array = key.toCharArray();
		int[] key_intarray = new int[key_array.length];
		
		answer = leftrotate(encrypted_text, rotation);
		
		char[] encrypted_array = answer.toCharArray();
		
		for (int i = 0; i < key_array.length; i++) {
			key_intarray[i] = key_array[i] - 96;
		}
		
		String test = "";
		
		for (int i = 0; i < encrypted_array.length; i++) {
			char temp;

			if ((encrypted_array[i] - key_intarray[i]) < 'a') {
				temp = (char) (encrypted_array[i] - key_intarray[i] +26);
			} else {
				temp = (char) (encrypted_array[i] - key_intarray[i] );
			}

			test += temp;
		}
		
		System.out.println(test);
		
		return answer;
	}
	
	 static String leftrotate(String str, int d)
	    {
	            String ans;
	            
	            for(int i=0; i<d; i++) {
	            	char temp = str.charAt(0);
	            	str = str.substring(1);
	            	str += temp;
	            }
	            
	            ans = str;
	            
	            return ans;
	    }
}