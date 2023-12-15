package 백준.기본기.N번째큰수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int j=0; j<10; j++) {
				list.add(sc.nextInt());
				Collections.sort(list);
			}
			
			System.out.println(list.get(list.size()-3));
		}
	}
}
