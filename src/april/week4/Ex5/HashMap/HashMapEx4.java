package april.week4.Ex5.HashMap;

import java.util.*;
import java.util.Map.Entry;

class HashMapEx4 {
	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		HashMap<String, Integer> map = new HashMap();

		
		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}

		//it might be better than pervious one.
		for(int i=0; i<data.length; i++) {
			map.put(data[i], map.getOrDefault(data[i], 0) + 1);
		}

		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			int value = (entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	} // main

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}

		return new String(bar); // String(char[] chArr)
	}
}
