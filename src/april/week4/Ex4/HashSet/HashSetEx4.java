package april.week4.Ex4.HashSet;

import java.util.*;

class HashSetEx4 {
	public static void main(String args[]) {
		HashSet setA    = new HashSet();
		HashSet setB    = new HashSet();
		HashSet setHab = new HashSet();//합집합
		HashSet setKyo = new HashSet();//교집합
		HashSet setCha = new HashSet();//차집합

		setA.add("1");		setA.add("2");
		setA.add("3");		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");		setB.add("5");
		setB.add("6");		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);

		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		System.out.println("A ∩ B = "+setKyo);  // 한글 ㄷ을 누르고 한자키
		System.out.println("A ∪ B = "+setHab);  // 한글 ㄷ을 누르고 한자키
		System.out.println("A - B = "+setCha); 
	}
}
