package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class StreamPipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45),
				new Member("박수미", Member.FEMALE, 27),
				new Member("신용권", Member.FEMALE, 45),
				new Member("신용권", Member.MALE, 45));
		
		double ageAvg = list.stream().distinct().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		
		//Female
		list.stream().distinct().filter(m->m.getSex() == 1).forEach(e->System.out.println(e.getAge()));
		
		//distinct 구현
		Set<Member> set = new HashSet<Member>();
		
		for(Member m : list) {
			set.add(m);
		}
		System.out.println("set 테스트");
		set.stream().forEach(e->System.out.println(e.getName()+ " 성별 : " + e.getSex() + " 나이 : " + e.getAge()));
		
		System.out.println(ageAvg);
	}

}


