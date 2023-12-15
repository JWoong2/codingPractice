package april.week2.Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[50];
		int index=0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		//default data
		students[index++]= new Student("홍길동", 1, 1, 100, 70, 70);
		
		while(run) {
			System.out.println("1. 모든 학생 출력");
			System.out.println("2. 각 학생 성적 평균");
			System.out.println("3. 각 학생 성적 합계");
			System.out.println("4. 학생 데이터 입력");
			System.out.println("5. 모든 학생 평균 합계");
			
			switch(sc.nextInt() ) {
			case 1: 
				for(int i=0; i<index; i++) {
					students[i].showAllData();
				}
				break;
			case 2 :
				System.out.println(students[sc.nextInt()-1].getAverage());
				break;
			case 3 :
				System.out.println("학생 아이디 : ");
				System.out.println(students[sc.nextInt()-1].getTotal());
				break;
				
			case 4 :
				System.out.println("학생 이름 : ");
				String name = sc.next();
				System.out.println("학생 반 : ");
				int classNo = sc.nextInt();
				System.out.println("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.println("영어 점수 : ");
				int eng = sc.nextInt();
				System.out.println("수학 점수 : ");
				int math = sc.nextInt();
				
				//학생 새 객체 만들기
				students[index] = new Student(name, classNo, index++, kor, eng, math);
				break;

			case 5 : 
				for(int i = 0; i<index; i++) {
					System.out.println("이름 : " + students[i].name + " 평균 : "+ students[i].getAverage() + " 총점 : " + students[i].getTotal());
					}
				break;
				
			}
			
		}
		
		
		
	}

}
