package may.week4.Ex5.Reference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel");
		
		Member member3 = new Member("이렇게는", "못만드나봄", "ㅋㅋㅋ");
		
		System.out.println(member3.getId());
	}
}
