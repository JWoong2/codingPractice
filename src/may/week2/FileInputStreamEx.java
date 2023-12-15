package may.week2;

//import java.io.*;
//public class FileInputStreamEx{
//	public static void main(String arg[]){
//		FileInputStream fis = null;
//		byte _read[] = new byte[100];
//		byte console[] = new byte[100];
//		try{
//			System.out.print("파일명 : ");
//			System.in.read(console);
//			String file = new String(console).trim();
//			fis = new FileInputStream(file);
//			fis.read(_read,0,_read.length);
//			System.out.println(
//					new String(_read).trim());
//		}catch(FileNotFoundException fnfe){
//			fnfe.printStackTrace();
//		}catch(IOException ie){
//			ie.printStackTrace();
//		}finally{
//			try{
//				if(fis != null) 
//					fis.close();
//			}catch(IOException ioe){
//				ioe.printStackTrace();
//			}
//		}
//	}
//}
import java.io.*;
public class FileInputStreamEx{
	public static void main(String arg[]){
		//FileInputStream fis = null;
		byte console[] = new byte[100];//경로
		byte _read[] = new byte[100];//파일에서 읽어옴
		System.out.print("파일명 : ");
		try {
			System.in.read(console);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String file = new String(console).trim();//경로
		
		try(FileInputStream fis = new FileInputStream(file);){
			fis.read(_read,0,_read.length);
			System.out.println(new String(_read).trim());
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
