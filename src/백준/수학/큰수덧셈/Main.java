package ¹éÁØ.¼öÇĞ.Å«¼öµ¡¼À;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] array = input.split(" ");
		
		BigInteger a = new BigInteger(array[0]);
		BigInteger b = new BigInteger(array[1]);

		System.out.println(a.add(b));
	}
}
