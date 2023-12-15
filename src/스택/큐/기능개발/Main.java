package 스택.큐.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Program {
	int progress, speed;

	public Program(int progress, int speed) {
		super();
		this.progress = progress;
		this.speed = speed;
	}
	
	public void progressing() {
		this.progress += this.speed;
	}
}

class Main {
	public static void main(String[] args) {
		int[] answers = solution(new int[] {93,30,55}, new int[]{1,30,5});
		
		for(int i : answers) {
			System.out.println(i);
		}
	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        	
        Queue<Program> queue = new LinkedList<Program>();
        List<Integer> programDoneCount = new ArrayList<Integer>();
        
        
        for(int i=0; i<progresses.length; i++) {
        	queue.add(new Program(progresses[i], speeds[i]));
        }
        
        while(!queue.isEmpty()) {
        	int doneCount = 0;
        	
        	for(Program p : queue) {
        		p.progressing();
        	}
        	
        	int size = queue.size();
        	for(int i=0; i<size; i++) {
        		if(queue.peek().progress >= 100) {
        			doneCount++;
        			queue.poll();
        		}else {
        			break;	
        		}
        	}
        	
        	if(doneCount != 0) {
        		programDoneCount.add(doneCount);
        	}
        }
        
        answer = new int[programDoneCount.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = programDoneCount.get(i);
        }
        
        return answer;
    }
}