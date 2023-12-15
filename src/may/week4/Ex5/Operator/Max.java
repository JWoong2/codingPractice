package may.week4.Ex5.Operator;

import java.util.function.IntBinaryOperator;

public class Max {
	public static void main(String[] args) {
		IntBinaryOperator ibo = (i, j) -> {
			return Math.max(i, j);
		};
		System.out.println(ibo.applyAsInt(10, 30));
		
		IntBinaryOperator ibo2 = Math:: max;
		System.out.println(ibo2.applyAsInt(10, 100));
	}
}
