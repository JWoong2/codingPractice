package 스택.큐.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	class Program {
		int progress;
		int speed;

		public Program(int progress, int speed) {
			this.progress = progress;
			this.speed = speed;
		}
		
		public void Progressing() {
			this.progress = this.progress +this.speed; 
		}
	}

	public int[] solution(int[] progresses, int[] speeds) {

		Queue<Program> onProgress = new LinkedList<Program>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < progresses.length; i++) {
			onProgress.add(new Program(progresses[i], speeds[i]));
		}

		while (!onProgress.isEmpty()) {
            int size = onProgress.size();
			for (Program p : onProgress) {
				p.Progressing();
			}
			
			int doneProgressNum = 0;
			
            
            for (int i =0; i<size; i++) {
				if (onProgress.peek().progress >= 100) {
					doneProgressNum++;
					onProgress.remove();
				} else break;
			}
            
			if(doneProgressNum!=0) temp.add(doneProgressNum);
		}

		int[] answer = new int[temp.size()];
		for(int i = 0; i<temp.size(); i++) {
			answer[i] = temp.get(i);
		}
		
		return answer;
	}

}