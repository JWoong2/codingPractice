package april.week4.Ex5.Iterator;

import java.util.*;

class IteratorEx1
{
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("it");
		list.add("can?");
		
		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	} // main
} // class
