package april.week4.Ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PersonInfo {
	private String s_birth;
	private String name;
	SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
	
	public PersonInfo(String s_birth, String name) {
		super();
		this.s_birth = s_birth;
		this.name = name;
	}
	public String getS_birth() {
		return s_birth;
	}
	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		Date date = new Date(s_birth);
		
		//태어난 년도 만드는 캘린더
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		//오늘 날짜 만드는 cal
		Calendar today = Calendar.getInstance();
		long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(60*60*1000);
		System.out.println(name + "의 생일은 " + df.format(date) + day + "차이가 있습니다.");
	}
}