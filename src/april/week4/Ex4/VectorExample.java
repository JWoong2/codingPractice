package april.week4.Ex4;

import java.util.Random;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			vector.add(rd.nextInt(10));	
		}

		
		for(int i : vector) {
			System.out.println(i);
		}
		
		vector.stream().distinct().forEach(x->System.out.println(x));
	}
}
