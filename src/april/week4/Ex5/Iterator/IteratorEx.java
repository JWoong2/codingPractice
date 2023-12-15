package april.week4.Ex5.Iterator;
//Iterator - �÷��ǿ� ����� ��ü�� �о���� ����� ǥ��ȭ�� �������̽�.
//Enumeration
import java.util.*;
class IteratorEx{

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);

		v.add("a");
		v.add("b");
		v.add("c");

		System.out.println("����ũ��:"+v.size());

		Iterator<String> it = v.iterator(); // Iterator���
		while(it.hasNext()){
			System.out.println(it.next());
			//it.remove(); // ���� �÷��ǿ��� ��� ����
		}
		it.remove();
		
		System.out.println("����ũ��:"+v.size());
		
		System.out.println(v);
		
	}
}
