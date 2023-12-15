package week4.Ex2;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("È«±æµ¿");
		Member m2 = new Member("¹Úµ¿¼ö");
		Member m3 = new Member("±è¹Î¼ö");
		Member[] members = { m1, m2, m3 };
		Member[] test = Arrays.copyOf(members, members.length);

		for (Member s : test) {
			System.out.println(s.name);
		}

		Arrays.sort(members);
		int index = Arrays.binarySearch(members, m1);
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);

		for (Member m : members) {
			System.out.println(m.name);
		}

	}

}
