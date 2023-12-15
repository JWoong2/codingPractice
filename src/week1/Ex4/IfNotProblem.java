package week1.Ex4;

import java.util.Scanner;

public class IfNotProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("x ���ڸ� �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.println("y ���ڸ� �Է��ϼ��� : ");
		int y = sc.nextInt();

		notTen(x);

		System.out.println("���� 2��");
		for (int i = 100; i <= 300; i++) {
			checkAllEven(i);
		}

		System.out.println("���� 3��");
		sub(x, y);

		System.out.println("���� 4��");
		for (int i = 1; i <= 200; i++) {
			basu(i);
		}

		System.out.println("");
		System.out.println("���� 5��");
		System.out.println("�ҵ漼�� ���ϱ� ���� �ݾ��� �Է��ϼ��� : (���� ����)");
		int num = sc.nextInt();
		// ���� 5��
		calculate(num);

		forState();
	}

	// ���� 1��
	public static void notTen(int x) {
		if (x != 10) {
			System.out.println("���� 1 : ok");
		}
	}

	// ���� 2��
	public static void checkAllEven(int num) {
		int a = 0;
		int count = 0;
		int ans = num;

		if (num >= 200 && num < 300) {
			for (int i = 0; i < Integer.toString(num).length(); i++) {
				a = num % 10;
				if (a % 2 == 0) {
					num = num / 10;
					count++;
				}
			}
		}

		if (count == 2) {
			System.out.print(ans + ", ");
		}
	}

	// ���� 3��
	public static void sub(int x, int y) {
		if (x > y) {
			System.out.println("���� 3 : " + (x - y));
		} else {
			System.out.println("���� 3 : " + (y - x));
		}
	}

	// ���� 4��
	public static void basu(int x) {
		if (x % 7 == 0) {
			if (x % 5 == 0) {

			} else {
				System.out.print(x + ", ");
			}
		}
	}

	// ���� 5��
	public static void calculate(int x) {
		if (x > 8000) {
			System.out.println("���� : 35%");
		} else if (x > 4000 && x<= 8000) {
			System.out.println("���� : 26%");
		} else if (x > 1000  && x <= 4000) {
			System.out.println("���� : 17%");
		} else if (x <= 1000) {
			System.out.println("���� : 8%");
		} else if(x < 0){
			System.out.println("Wrong Value");
		}
	}

	public static void forState() {
		Scanner sc = new Scanner(System.in);
		System.out.print("for ������ȣ�� �Է����ּ��� : ");

		int a = sc.nextInt();
		int sum = 0;

		switch (a) {
		case 1:
			for (int i = 0; i <= 3; i++) {
				System.out.print(i + " ");

			}
			break;

		case 2:
			for (int i = 0; i <= 20; i++) {
				System.out.print(i + " ");
			}

			break;

		case 3:
			for (int i = 1; i <= 20; i++) {
				System.out.print(i + " ");
			}

			break;

		case 4:
			for (int i = 1; i <= 20; i++) {
				if (i % 2 != 0)
					System.out.print(i + " ");
			}

			break;

		case 5:
			for (int i = 0; i <= 100; i++) {
				if (i % 10 == 0)
					System.out.print(i + " ");
			}

			break;

		case 6:
			for (int i = 1; i <= 100; i++) {
				if (i % 3 == 0) {
					if (i % 5 == 0) {
						System.out.print(i + " ");
					}

				}
			}
			break;

		case 7:
				getPrime(100);
				break;
			
		case 8:
			for (int i = 1; i < 100; i++) {
				sum += i;
				if (sum > 300) {
					System.out.println("�� ������ �� : " + sum + ", ���������� ������ �� : " + i);

					break;
				}
			}
			break;
		}

	}

	public static void getPrime(int num) {
		int i = 2; // i : ���� ���
		boolean isPrime = true;

		while (i <= num) {
			isPrime = true;

			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
				continue;
			}

			if (isPrime == true)
				System.out.print(i + ", ");
			i++;
		}
	}
}
