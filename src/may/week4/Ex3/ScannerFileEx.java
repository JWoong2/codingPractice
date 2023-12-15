package may.week4.Ex3;

import java.util.*;
import java.io.*;

public class ScannerFileEx {
	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(new File("d:\\scan.txt"));
			while (scan.hasNextDouble()) {
				System.out.printf("½ºÄµ double : %,.2f %n", scan.nextDouble());
			}
			// scan.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (scan != null)
				scan.close();
		}
	}
}
