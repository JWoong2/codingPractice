package may.week4.Ex3.MemberManage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Woong\\addrInput.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String data = null;
		Set<Customer> set = new HashSet<Customer>();
		while((data = br.readLine()) != null) {
			if(data != null) {
				String[] memberInfo = data.split(",");
				Customer c = new Customer(memberInfo[0], memberInfo[1], memberInfo[2]);
				set.add(c);
				
			}
		}
		set.stream().sorted().forEach(x->System.out.println(x));
		
		Set<Customer> tree = new TreeSet<Customer>(set);
		Iterator<Customer> it = tree.iterator();
		
		System.out.println("iterator »ç¿ë");
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println(c.toString());
		}
	}
}
