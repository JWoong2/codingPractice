package april.week4.Ex5.HashMap;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i<data.length; i++) {
			map.put(data[i], map.getOrDefault(data[i], 0) + 1);
		}
		
		System.out.println(map);
		
		int a = 3;
		int b = 7;
		
		int sum = 0;
		int index= 0;
		
		for(int i = 1; i < b; i++) {
			for(int j=0; j<i; j++) {
				index++;
				if(index >= a && index <= b) {
					sum += i; 
				}	
			}
		}
		
		sum = 0;
		int cnt =1;
		int temp =1;
		
		for(int i = 1; i<=b; i++) {
			cnt--;
			if(i>=a) {
				sum += temp;
			}
			
			if(cnt ==0) {
				cnt = ++temp; 
			}
		}
		
		System.out.println(sum);
		
	}
}
