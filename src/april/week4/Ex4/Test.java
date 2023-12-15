package april.week4.Ex4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNum = "01083824382";
		int length = phoneNum.length();
		
		String answer = phoneNum.substring(length-4, length);
		System.out.println(answer);
		for(int i=0; i<length-4; i++) {
			answer = "*" + answer;
		}
		
		System.out.println(answer);
	}

}
