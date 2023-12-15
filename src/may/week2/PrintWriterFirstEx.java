package may.week2;

import java.io.*;
public class PrintWriterFirstEx {
	public static void main(String arg[]) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("d:\\printWriterFirst.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			pw.println("æ»≥Á«œººø©");
			pw.println("π›∞©Ω¿¥œ¥Ÿ.");
			pw.println(100);
			pw.println(new Integer("1000"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fw != null)	fw.close();
				if (bw != null)	bw.close();
				if (pw != null)	pw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}