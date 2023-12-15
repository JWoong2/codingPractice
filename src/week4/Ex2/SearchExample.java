package week4.Ex2;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = { m1, m2, m3 };
		Member[] test = Arrays.copyOf(members, members.length);

		for (Member s : test) {
			System.out.println(s.name);
		}

		Arrays.sort(members);
		int index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);

		for (Member m : members) {
			System.out.println(m.name);
		}

	}

}
