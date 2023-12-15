package week4.Ex1;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "»¡°­/ÁÖÈ²,³ë¶û,ÃÊ·Ï&ÆÄ¶û/³²/º¸¶ó";
		
		String[] color_arr = color.split("/|,|&");
		
		for(String s : color_arr) {
			System.out.println(s);
		}
 	}

}
