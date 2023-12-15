package may.week2;

//import java.io.*;
//public class FileInputStreamEx{
//	public static void main(String arg[]){
//		FileInputStream fis = null;
//		byte _read[] = new byte[100];
//		byte console[] = new byte[100];
//		try{
//			System.out.print("���ϸ� : ");
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
		byte console[] = new byte[100];//���
		byte _read[] = new byte[100];//���Ͽ��� �о��
		System.out.print("���ϸ� : ");
		try {
			System.in.read(console);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String file = new String(console).trim();//���
		
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
