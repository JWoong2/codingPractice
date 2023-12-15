package april.week4.Ex5.HashMap;

import java.util.*;
import java.util.Map.Entry;

class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));

		Set set = map.entrySet();
		// entrySet key�� value ��� �ʿ��� ���

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
		}

		// ��� 02 : keySet()
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("[key]:" + key + ", [value]:" + value);
        }
        // ��� 03 : entrySet().iterator()
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
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}

		// keySet�� key ���� �ʿ��� ���
		set = map.keySet();
		System.out.println("������ ��� : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + (float) total / set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}
