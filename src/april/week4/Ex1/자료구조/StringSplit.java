package april.week4.Ex1.�ڷᱸ��;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "����/��Ȳ,���,�ʷ�&�Ķ�/��/����";
		
		String[] color_arr = color.split("/|,|&");
		
		for(String s : color_arr) {
			System.out.println(s);
		}
 	}

}
