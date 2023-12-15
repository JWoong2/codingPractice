package may.week4.Ex3.Excel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Book> list = new ArrayList<Book>();
		FileReader in = null;
		BufferedReader bufin = null;

		in = new FileReader("D:\\Woong\\book_list.csv");
		bufin = new BufferedReader(in);
		String data = null;
		
//		do {
//			data = bufin.readLine();
//			if (data != null) {
//				String[] bookInfo = data.split(",");
//				list.add(new Book(Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2],
//						Integer.parseInt(bookInfo[3]))); 
//				
//			}
//		} while (data != null);

		while((data = bufin.readLine()) != null) {
			if (data != null) {
				String[] bookInfo = data.split(",");
				list.add(new Book(Integer.parseInt(bookInfo[0]), bookInfo[1], bookInfo[2],
						Integer.parseInt(bookInfo[3]))); 
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}
}
