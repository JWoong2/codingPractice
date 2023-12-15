package _�˰���.chapter4.�ð����⵵;

import java.util.ArrayList;import javax.swing.plaf.basic.BasicBorders.MarginBorder;

// DESC : �־��� �迭���� ���� ���� �����ϴ� ���ڸ� ��ȯ�ϱ�

// �־��� �迭A���� ���� ���� �����ϴ� ���ڸ� ��ȯ�Ѵ�.
// ���� �� ���� �̻� ���� ��� �ƹ����̳� ��ȯ�Ѵ�.

public class Exp {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(50);
		list.add(30);
		
		System.out.println(majority1(list));
		System.out.println(majority2(list));
	}
	
	public static int majority1(ArrayList<Integer> A) {
		int N = A.size();
		int majority = -1, majorityCount = 0;
		for(int i=0; i<N; i++) {
			int V = A.get(i), count = 0;
			for(int j=0; j<N; j++ ) {
				if(A.get(i) == V) {
					count++;
				}
			}
		
			// ���ݱ��� �� �ִ� �󵵺��� ���� �����ߴٸ� ���� �����Ѵ�.
			if(count > majority) {
				majorityCount = count;
				majority = V;
				
			}
		}
		
		return majority;
	}
	
	public static int majority2(ArrayList<Integer> A) {
		int N = A.size();
		int[] array = new int[101];
		for(int i=0; i<N; i++) {
			array[A.get(i)]++;
		}
		
		int majority = 0;
		for(int i=1; i<=100; i++) {
			if(array[i] > array[majority]) {
				majority = i;
			}
		}
		
		return majority;
	}
}
