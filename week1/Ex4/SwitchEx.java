package week1.Ex4;

import java.text.SimpleDateFormat;
import java.util.*;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();

		String s = d.toString();
		System.out.println("현재날짜 : " + s);

		SimpleDateFormat y = new SimpleDateFormat("yyyy");
		int year = Integer.parseInt(y.format(d));

		SimpleDateFormat m = new SimpleDateFormat("M");
		int month = Integer.parseInt(m.format(d));
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 입니다");
			break;
			
		case 2:
			if (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(month + "월은 28일까지 입니다");
				break;
			}
			
			System.out.println(month + "월은 29일까지 입니다");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 입니다");
			break;

		default:
			System.out.println("옳지 않은 달입니다.");
			break;
		}
	}

}
