package �˰��򷦽�.level6.ū�ڸ�������;

import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
       // Please Enter Your Code Here
    	
    	BigInteger A = sc.nextBigInteger();
    	BigInteger B = sc.nextBigInteger();
    	BigInteger answer = A.subtract(B);
    	
    	// ���� �������� ������ �ϴ°�
    	System.out.println(answer);
    }
}