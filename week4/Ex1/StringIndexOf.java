package week4.Ex1;

import java.util.ArrayList;
import java.util.List;

public class StringIndexOf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lastIndexOf 이용해서 출력
		String[] fileNames = {"javaTest.txt",  "test.ex1.java"};
		
		String[] title = new String[fileNames.length];
		String[] exe= new String[fileNames.length];
		
		for(int i = 0 ; i<fileNames.length; i++) {
			title[i] = fileNames[i].substring(0, fileNames[i].lastIndexOf("."));
			exe[i] = fileNames[i].substring(fileNames[i].lastIndexOf("."));
		}
		
		for(String s : title) {
			System.out.println(s);
		}
		
		for(String s : exe) {
			System.out.println(s);
		}
		
		// split 이용
		String[] filename= fileNames[1].split("[.]");
		List<String> list = new ArrayList<String>();
		
		for(String s : filename) {
			list.add(s);	
		}
		
		System.out.println(list.get(list.size()-1));
		
		
	}
}