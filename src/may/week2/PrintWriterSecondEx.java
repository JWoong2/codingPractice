package may.week2;

import java.io.*;

public class PrintWriterSecondEx {
	public static void main(String arg[]) {
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("d:\\printWriterSecond.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			pw.println("¾È³çÇÏ¼¼¿©!!");
			pw.println("¶Ç ¸¸³µ³×¿ä.");
			pw.println(100.0);
			pw.println(new Boolean(true));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (bos != null) bos.close();
				if (pw != null) pw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}