package week2.Ex5;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public Song() {
		super();
	}
	
	public void show() {
		System.out.println("�⵵ : " + this.year + " ���� : " + this.country + " ���� : " + this.artist + " ���� : " + this.title);
	}
	
}
