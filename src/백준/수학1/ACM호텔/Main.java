package 백준.수학1.ACM호텔;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ho = 0;
		int floor = 0;
		String roomNumber = "";
		
		for(int i=0; i<n; i++) {
			roomNumber = "";
			int height = sc.nextInt();
			int customer = sc.nextInt();
			
			if(customer%height ==0 ) {
				floor = height;
				ho = (customer/height);
			}else {
				floor = customer%height;
				ho = (customer/height)+1;
			}
			
			if(ho<10) {
				roomNumber += floor + "0" +ho;	
			}else {
				roomNumber += floor + "" +ho;
			}
			System.out.println(roomNumber);
		}
		
	}
}
