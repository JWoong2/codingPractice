package _테스트.회전판과로봇;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Command {
	String direction;
	int rollWay;
	int movement;

	public Command(String direction, int rollWay, int movement) {
		super();
		this.direction = direction;
		this.rollWay = rollWay;
		this.movement = movement;
	}

}

//2
//5 6 1 2
//0 1 1 2 3
//2 5 -1 2 0
//10 29 17 -1 3
//5 4 7 9 12
//11 19 -1 12 4
//7 8 9 1 3
//3
//2 4 1
//3
//S 1 2
//N 2 1
//E 2 5
//5 6 2 5
//0 1 1 2 3
//2 5 -1 2 0
//10 29 17 -1 3
//5 4 7 9 12
//11 19 -1 12 4
//7 8 9 1 3
//5
//2 5 3 1 0
//5
//S 1 3
//N 1 4
//W 2 1
//N 1 7
//E 1 1

//#1 54 2 5
//#2 65 2 2

public class Main {
	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스
		int T = sc.nextInt();
		int testCase = 1;
		while (T-- > 0) {
			// 도로의 가로 세로 크기
			int n = sc.nextInt();
			int m = sc.nextInt();
			// 현재 로봇 위치
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;

			int[][] roadScore = new int[m][n];

			// 도로 점수 초기화
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					roadScore[i][j] = sc.nextInt();
				}
			}
			
			System.out.println();
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(roadScore[i][j] + " ");
				}
				System.out.println();
			}
			
			// 회전판 칸의 개수
			int k = sc.nextInt();
			int[] rollBoard = new int[k];

			// 초기에 가장 앞의 값이 먼저 !
			for (int i = 0; i < k; i++) {
				rollBoard[i] = sc.nextInt();
			}
			
			// 로봇 움직임 횟수
			int l = sc.nextInt();

			List<Command> list = new ArrayList<Command>();
			for (int i = 0; i < l; i++) {
				list.add(new Command(sc.next(), sc.nextInt(), sc.nextInt()));
			}

			int score = roadScore[y][x];
			roadScore[y][x] = 0;
			for (Command c : list) {
				boolean run = true;
				int moveCnt=0;
				if (c.rollWay == 1) {
					moveCnt= rollBoard[(c.movement - 1)%rollBoard.length];
				} else {
					moveCnt= rollBoard[rollBoard.length-(c.movement%rollBoard.length)];
				}

				for (int i = 0; i <moveCnt; i++) {
					if (!run) {
						break;
					}
					switch (c.direction) {
					
					case "N":
						if (y > 0) {
							y-=1;
							if(roadScore[y][x] == -1) {
								run = false;
								y+=1;
							}
							score += roadScore[y][x];
							roadScore[y][x] = 0;
						} else {
							run = false;
						}
						break;

					case "E":
						if (x <= m-1) {
							x+=1;
							if(roadScore[y][x] == -1) {
								run = false;
								x-=1;
							}
							score += roadScore[y][x];
							roadScore[y][x] = 0;
						} else {
							run = false;
						}
						break;

					case "S":
						if (y <= n-1) {
							y+=1;
							if(roadScore[y][x] == -1) {
								run = false;
								y-=1;
							}
							score += roadScore[y][x];
							roadScore[y][x] = 0;
						} else {
							run = false;
						}
						break;

					case "W":
						if (x > 0) {
							x-=1;
							if(roadScore[y][x] == -1) {
								run = false;
								x+=1;
							}
							score += roadScore[y][x];
							roadScore[y][x] = 0;
						} else {
							run = false;
						}
						break;
					}
				}
			}
			x+=1;
			y+=1;
			System.out.println("#"+testCase++ +" "+ score + " " + x + " " + y);
		}
	}
}