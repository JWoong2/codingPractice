package 알고리즘랩스.level6.큰자리수뺄셈;

import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
       // Please Enter Your Code Here
    	
    	BigInteger A = sc.nextBigInteger();
    	BigInteger B = sc.nextBigInteger();
    	BigInteger answer = A.subtract(B);
    	
    	// 가장 마지막과 뺄셈을 하는것
    	System.out.println(answer);
    }
}