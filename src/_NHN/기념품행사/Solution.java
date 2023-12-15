package _NHN.���ǰ���;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution{
	public static void main(String[] args) {
		int ans = solution(new int[] {5,3,15});
		
		System.out.println(ans);
	}
	
    public static int solution(int[] goods){

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : goods) {
        	queue.add(i);
        }
        
        int price = 0;
        int total = 0;
        
        // 50�� �Ǵ°� ���� ����
        for(int i=0; i<goods.length; i++) {
        	if(goods[i] >= 50) {
        		total += goods[i]-10;
        	}else {
        		price += goods[i];
        		if(price >= 50) {
        			total += price-10;
        			price = 0;
        		}
        	}
        }
        
        total += price;
                                 
        return total;
    }
}