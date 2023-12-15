package may.week4.Ex3.MemberManage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressList {

	Set<Address> set = new HashSet<Address>();
	List<Address> list = new ArrayList<Address>();

	// ÇÑÁÙ¾¿ input
	public void inputAddr() throws IOException {
		FileReader fr = new FileReader("D:\\Woong\\addrInput.txt");
		BufferedReader bf = new BufferedReader(fr);

		String data = null;
		while ((data = bf.readLine()) != null) {
			if (data != null) {
				makeAddress(data);
			}
		}
	}

	public void makeAddress(String msg) {
		String[] addrInfo = msg.split(",");
		set.add(new Address(addrInfo[0], addrInfo[1], addrInfo[2]));
	}
	
	public void sortList() {
		list = new ArrayList<Address>(set);
		Collections.sort(list);
		System.out.println(list);
	}

	public void output() {
		try {
			PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter("D:\\addrOutput.txt")), true);
			
			for (Address ad : list) {
				pr.println(ad);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		AddressList addressList = new AddressList();
		addressList.inputAddr();
		addressList.sortList();
		addressList.output();
	}
}
