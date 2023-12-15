package april.week4.Ex5.Iterator;
//Iterator - 컬렉션에 저장된 객체를 읽어오는 방법을 표준화한 인터페이스.
//Enumeration
import java.util.*;
class IteratorEx{

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);

		v.add("a");
		v.add("b");
		v.add("c");

		System.out.println("벡터크기:"+v.size());

		Iterator<String> it = v.iterator(); // Iterator얻기
		while(it.hasNext()){
			System.out.println(it.next());
			//it.remove(); // 원본 컬렉션에서 요소 삭제
		}
		it.remove();
		
		System.out.println("벡터크기:"+v.size());
		
		System.out.println(v);
		
	}
}
