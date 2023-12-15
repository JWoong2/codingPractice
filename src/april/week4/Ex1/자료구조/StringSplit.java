package april.week4.Ex1.자료구조;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "빨강/주황,노랑,초록&파랑/남/보라";
		
		String[] color_arr = color.split("/|,|&");
		
		for(String s : color_arr) {
			System.out.println(s);
		}
 	}

}
