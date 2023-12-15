package april.week4.Ex4.HashSet;

import java.util.*;

class HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p.name.equals(this.name) && p.age == this.age;

		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}
}
