package may.week4.Ex5.Reference;

public class Member {
	private String name;
	private String id;
	private String phoneNumber;
	
	public Member() {
		System.out.println("Member() 실행");
	}
	public Member(String id) { 
		System.out.println("Member(String id) 실행");
		this.id = id; 
	}
	public Member(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}

	public Member(String name, String id, String phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}
	public String getId() { return id; }
}
