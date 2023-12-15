package april.week4.Ex4.HashSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
//		for (int i = 0; set.size() < 6 ; i++) {
//			int num = (int)(Math.random()*45) + 1;
//			set.add(new Integer(num));
//		}

		while(set.size() != 6) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
		// 이거 처음알았다 중요 
		set.stream().sorted().forEach(x->System.out.println(x));
		
		List<Integer> list = new LinkedList<Integer>(set);	// LinkedList(Collection c)
		
		
		Collections.sort(list);				// Collections.sort(List list)
		
		System.out.println(list);
		
		
		String pattern = "yyyy";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		
		String now = 
				"1999"
				;
		System.out.println(now);
		
		try {
			System.out.println(df.parse(now));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
