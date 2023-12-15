package april.week1.Ex1;

import java.util.*;

public class Ex1 {
	public class Member {
		public String name;
		public int age;

		public Member(String name, int age) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if (obj instanceof Member) {
				Member member = (Member) obj;
				return member.name.equals(name) && (member.age == age);
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return name.hashCode() + age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("test", 10);
		map.put("test2", 20);
		map.put("test3", 30);
		map.put("test2", 40);

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + value);
		}
		
	}

}
