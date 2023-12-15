package 자료구조.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Program{
	int progress;
	int speed;
	
	public Program(int progress, int speed) {
		super();
		this.progress = progress;
		this.speed = speed;
	}

	public void progressing() {
		this.progress += this.speed;
	}
}

class Solution {
	public static void main(String[] args) {
		int[] test = solution(new int[] {93,30,55}, new int[] {1,30,5});
		
		for(int i : test) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Program> onProgress = new LinkedList<Program>();
		List<Integer> answerTemp = new ArrayList<Integer>();
		for(int i=0; i<progresses.length; i++) {
			onProgress.add(new Program(progresses[i], speeds[i]));
		}
		
		while(!onProgress.isEmpty()) {
			int size = onProgress.size(); // 이거 하나 때문에 틀렸음 새로 갱신해줘야한다 필수 ^^
			for(Program p : onProgress) {
				p.progressing();
			}
			
			int doneProgressCount = 0;
			for(int i = 0 ; i< size; i++) {
				if(onProgress.peek().progress >= 100) {
					onProgress.poll();
					doneProgressCount++;
				}else break;
			}
			
			if(doneProgressCount != 0) answerTemp.add(doneProgressCount);
		}
		
		int[] answer = new int[answerTemp.size()];
		
		for(int i = 0 ; i<answerTemp.size(); i++) {
			answer[i] = answerTemp.get(i);
		}
		
		return answer;
	}
	

}
