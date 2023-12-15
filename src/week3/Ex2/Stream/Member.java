package week3.Ex2.Stream;

public class Member {
	public static int MALE = 0;
	public static int FEMALE =1;
	
	private String name;
	private int sex;
	private int age;
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() +age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member) obj;
				return member.name.equals(name) && (member.age==age) && member.sex==sex;
		}
		return false;
	}
}
