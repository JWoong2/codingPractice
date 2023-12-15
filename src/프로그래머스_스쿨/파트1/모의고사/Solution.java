package 프로그래머스_스쿨.파트1.모의고사;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student {
	int no;
	int score;
	int[] answerWay;

	public Student(int no, int score, int[] answerWay) {
		super();
		this.no = no;
		this.score = score;
		this.answerWay = answerWay;
	}

	int scoring(int[] answer) {
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == answerWay[i % answerWay.length]) {
				score++;
			}
		}

		return score;
	}
}

class Solution {
	public int[] solution(int[] answers) {
		int[] answer = new int[3];
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 0, new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }));
		list.add(new Student(2, 0, new int[] { 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5 }));
		list.add(new Student(3, 0, new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }));

		int maxScore = 0;

		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).scoring(answers);
			if (maxScore < answer[i]) {
				maxScore = answer[i];
			}
		}

		int size = 0;
		for (int i = 0; i < answer.length; i++) {
			if (list.get(i).score == maxScore) {
				size++;
			}
		}

		answer = new int[size];
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (maxScore == list.get(i).score)
				answer[index++] = list.get(i).no;
		}

		Arrays.sort(answer);

		return answer;
	}
}