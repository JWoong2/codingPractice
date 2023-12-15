package week2.Ex4;

public class Stringer {
	String[] st = new String[50];
	int index=0;
	
	public void addString(String a) {
		st[index++] = a;
	}
	
	public void showAll() {
		for(int i = 0; i<index; i++) {
			System.out.println(st[i]);
		}
	}

	
}
