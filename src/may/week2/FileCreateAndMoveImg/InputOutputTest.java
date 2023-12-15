package may.week2.FileCreateAndMoveImg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력 : " + "ex ) D:\\Woong\\다운로드.png");
		String filename = sc.next();
		
		int index= 0; // db 
		String imgFile = "D:\\Woong\\img_" + index;
		File file = new File(imgFile);
		
		System.out.println(file.exists());
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("파일이 생성되었습니다.");
		} else {
			while(file.exists()) {
				imgFile = "D:\\Woong\\img_" + index++;
				file = new File(imgFile);
			}
			file.mkdir();
			System.out.println("파일이 생성되었습니다.");
		}
		
		int subname = filename.lastIndexOf('\\');
		String sub = filename.substring(subname+1);
		String movename = imgFile+"\\"+sub;
		
		System.out.println("옮겨질 파일명 : " + movename);
		
		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(movename);
			bos = new BufferedOutputStream(fos);
			int len = 0;
			byte readbyte[] = new byte[fis.available()];
			while ((len = bis.read(readbyte)) != -1) {
				bos.write(readbyte);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
