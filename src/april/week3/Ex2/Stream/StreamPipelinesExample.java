package april.week3.Ex2.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class StreamPipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27),
				new Member("�ſ��", Member.FEMALE, 45),
				new Member("�ſ��", Member.MALE, 45));
		
		double ageAvg = list.stream().distinct().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		
		//Female
		list.stream().distinct().filter(m->m.getSex() == 1).forEach(e->System.out.println(e.getAge()));
		
		//distinct ����
		Set<Member> set = new HashSet<Member>();
		
		for(Member m : list) {
			set.add(m);
		}
		System.out.println("set �׽�Ʈ");
		set.stream().forEach(e->System.out.println(e.getName()+ " ���� : " + e.getSex() + " ���� : " + e.getAge()));
		
		System.out.println(ageAvg);
	}

}


