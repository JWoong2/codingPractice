package april.week4.Ex5.HashMap;

import java.util.*;
import java.util.Map.Entry;

class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));

		Set set = map.entrySet();
		// entrySet key와 value 모두 필요한 경우

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
		}

		// 방법 02 : keySet()
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
        // 방법 03 : entrySet().iterator()
        Iterator<Map.Entry<String, Integer>> iteratorE = map.entrySet().iterator();
        while (iteratorE.hasNext()) {
            Entry<String, Integer> entry = (Map.Entry<String, Integer>) iteratorE.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
        
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}

		// keySet은 key 값만 필요한 경우
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}
