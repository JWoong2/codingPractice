package may.week4.Ex5.Supllier;

import java.util.function.IntSupplier;

public class SuplierEx {
	public static void main(String[] args) {
		IntSupplier is = () -> {
			int sum = 0;
			for (int i = 0; i <=10; i++) {
				sum+=i;
			}
			
			return sum;
		
		};
		
		System.out.println(is.getAsInt());
		
		
	}
}
