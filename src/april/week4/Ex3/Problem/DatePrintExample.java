package april.week4.Ex3.Problem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DatePrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		DatePrintExample test = new DatePrintExample();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(df.format(now));
		
		
		
		df = new SimpleDateFormat("MM dd E HH:mm:ss", Locale.US);
		System.out.println(df.format(now));
		
		
	}
}
