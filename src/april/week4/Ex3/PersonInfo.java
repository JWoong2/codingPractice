package april.week4.Ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PersonInfo {
	private String s_birth;
	private String name;
	SimpleDateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
	
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
		
		//�¾ �⵵ ����� Ķ����
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		//���� ��¥ ����� cal
		Calendar today = Calendar.getInstance();
		long day = (today.getTimeInMillis() - cal.getTimeInMillis())/(60*60*1000);
		System.out.println(name + "�� ������ " + df.format(date) + day + "���̰� �ֽ��ϴ�.");
	}
}