package 알고리즘랩스.level11.스택;

import java.util.Scanner;

class Stack {
	int[] data = new int[100];
	int index = 0;
	int capacity = 0;

	public Stack(int capacity) {
		super();
		this.capacity = capacity;
	}

	void push(int y) {
		if(index >= capacity) {
			System.out.println("Overflow");
		}else {
			data[index++] = y;
		}
	}

	void pop() {
		if(index <= 0) {
			System.out.println("Underflow");
		}else {
			data[index-1] = 0;
			index--;
			}
	}

	int top() {
		if(index <=0) return -1;
		else return data[index-1];
	}

	int size() {
		return index;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Stack s1 = new Stack(n);
		
		for(int i=0; i<m; i++) {
			switch (sc.nextInt()) {
			case 1:
				s1.push(sc.nextInt());
				break;
			case 2:
				s1.pop();
				break;
			case 3:
				if(s1.top() == -1) {
					System.out.println("NULL");
				}else {
					System.out.println(s1.top());
				}
				
				break;
			}
		}
		
	}
}
