package april.week1.Ex5;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= (int)(Math.random()*6),y =(int)(Math.random()*6);
		while(!(x + y == 5)) {
			x= (int)(Math.random()*6);
			y =(int)(Math.random()*6);
			System.out.println("("+ x + "," + y + ")");
		}
		System.out.println("Åë°ú");
		
	}

}
