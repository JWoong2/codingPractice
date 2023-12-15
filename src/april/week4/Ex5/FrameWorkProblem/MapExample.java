package april.week4.Ex5.FrameWorkProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("moon", 92);
		map.put("white", 70);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		// 방법 03 : entrySet().iterator()
        Iterator<Map.Entry<String, Integer>> iteratorE = map.entrySet().iterator();
        
        while (iteratorE.hasNext()) {
            Entry<String, Integer> entry = (Map.Entry<String, Integer>) iteratorE.next();
            if(maxScore <= entry.getValue()) {
            	name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore +=  entry.getValue();
            
        }
        System.out.println("[학생이름]:" + name + ", [최고점수]:" + maxScore);
        System.out.println("[합계점수]:" + totalScore);
        System.out.println("[평균점수]:" + (double) totalScore/map.size());
        
		
		}
}
