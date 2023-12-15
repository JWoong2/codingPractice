package _알고리즘.chapter4.분할정복.카라츠바의빠른곱셈알고리즘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		String test1_a = "123";
		String test2_b = "456";
		
		a = fromString(test1_a);
		b = fromString(test2_b);
		
		ArrayList<Integer> answer = karatsuba(a, b);
		
		String print1 = toStirng(answer);
		
		System.out.println(print1);
			
	}
	
	/*
	 * @desc num[]의 자릿수 올림을 처리한다. 
	 */
	public static ArrayList<Integer> normalize(ArrayList<Integer> num) {
		num.add(0);
		
		for(int i=0; i+1<num.size(); i++) {
			if(num.get(i) < 0 ) {
				int borrow = (Math.abs(num.get(i)) + 9 ) / 10;
				
				int temp = num.get(i+1) - borrow;
				num.set(i+1, temp);
				
				temp = num.get(i) + (borrow *10);
				num.set(i, temp);
			}else {
				num.set(i+1, num.get(i+1) + num.get(i) / 10) ;
				num.set(i, num.get(i) %10);
			}
		}
		
		if(num.get(num.size()-1) == 0 ) {
			num.remove(num.size() -1);
		}
		
		return num;
	}
	
	public static ArrayList<Integer> multiply(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		for(int i=0; i<a.size() + b.size() + 1; i++) {
			c.add(0);
		}
		
		for(int i=0; i<a.size(); i++) {
			for(int j=0; j<b.size(); j++) {
				c.set(i+j, c.get(i+j) + a.get(i)* b.get(j));
			}
		}
		
		for(int i=0; i<c.size(); i++) {
			System.out.print(c.get(i) + " ");
		}
		
		
		normalize(c);
		
		return c;
	}
	
	public static ArrayList<Integer> addTo(ArrayList<Integer> a, ArrayList<Integer> b, int k) {
		a = ensureSize(a, Math.max(a.size(), b.size() + k));
		for(int i=0; i<b.size(); i++) {
			a.set(i+k,  a.get(i+k) + b.get(i));
		}
		
		a= normalize(a);
		return a;
	}
	
	public static ArrayList<Integer> subFrom(ArrayList<Integer> a, ArrayList<Integer> b ) {
		a = ensureSize(a, Math.max(a.size(), b.size()) + 1 ) ;
		for(int i=0; i<b.size(); i++) {
			a.set(i, a.get(i) -b.get(i) );
		}
		
		a= normalize(a);
		return a;
	}
	
	public static ArrayList<Integer> karatsuba(ArrayList<Integer> a, ArrayList<Integer> b) {
		int a_size = a.size();
		int b_size = b.size();
		
		// a < b 일 경우 둘을 바꿈
		if(a_size < b_size) {
			return karatsuba(b, a);
		}
		
		// 기저 사례 : a나 b가 비워져있을 경우
		if(a_size == 0 || b_size == 0) {
			return null;
		}
		
		if(a_size <= 50) {
			return multiply(a, b);
		}
		
		int half = a_size / 2;
		
		ArrayList<Integer> a0 =new ArrayList<>(a.subList(0, half));
		ArrayList<Integer> a1 =new ArrayList<>(a.subList(half, a.size()));
		ArrayList<Integer> b0 =new ArrayList<>(b.subList(0, Math.min(b.size(), half)));
		ArrayList<Integer> b1 =new ArrayList<>(a.subList(Math.min(b.size(), half), b.size()));
		
		ArrayList<Integer> z2 = karatsuba(a1, b1);
		ArrayList<Integer> z0 = karatsuba(a0, b0);
		
		z0 = addTo(a0, a1, 0);
		z0 = addTo(b0, b1, 0);
		
		ArrayList<Integer> z1 = karatsuba(a0, b0);
		z1 = subFrom(z1, z0);
		z1 = subFrom(z1, z2);
		
		ArrayList<Integer> ret = new ArrayList<>();
		ret = addTo(ret, z0, 0);
		ret = addTo(ret, z1, half);
		ret = addTo(ret, z2, half *2);
		
		return ret;
	}
	
	public static String toStirng(List<Integer> a) {
		String ret = "";
		while(a.size() > 1 && a.get(a.size() -1) == 0) {
			a.remove(a.size() -1 );
		}
		
		for(int i=0; i<a.size(); i++) {
			ret += (char) ('0' + a.get(a.size() - 1 -i));
		}
		
		return ret;
	}
	
	
	public static ArrayList<Integer> fromString(String s) {
		ArrayList<Integer> ret = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			ret.add(s.charAt(i) - '0');
		}
		
		Collections.reverse(ret);
		return ret;
	}
	
	public static ArrayList<Integer> ensureSize(ArrayList<Integer> list, int size) {
		list.ensureCapacity(size);while(list.size() < size) {
			list.add(0);
		}
		
		return list;
	}
}
