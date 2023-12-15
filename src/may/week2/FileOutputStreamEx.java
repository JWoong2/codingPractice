package may.week2;

import java.io.*;

public class FileOutputStreamEx {
	public static void main(String arg[]) {
		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream("d:/fileout.txt");
			// fos = new FileOutputStream("f:\\fileout.txt",true);

			String message = "Hello FileOutputStream!!";
			fos.write(message.getBytes());
			// fos.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
