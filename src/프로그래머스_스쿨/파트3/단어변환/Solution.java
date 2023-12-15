package 프로그래머스_스쿨.파트3.단어변환;

import java.util.LinkedList;
import java.util.Queue;

class Word {
	int path;
	String word;
	public Word(int path, String word) {
		super();
		this.path = path;
		this.word = word;
	}
}

class Solution {
	public static void main(String[] args) {
		int ans = solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
		System.out.println(ans);
	}
	
    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean check = false;
        boolean[] visited = new boolean[words.length];
        for(int i=0; i<words.length; i++) {
        	if(target.equals(words[i])) check = true;
        }
        
        if(check) {
        	Queue<Word> queue = new LinkedList<Word>();
        	queue.add(new Word(0, begin));
        	
        	while(!queue.isEmpty()) {
        		Word temp = queue.poll();
        		int cnt = temp.path;
        		
        		if(temp.word.equals(target)) return cnt;
        		
        		for(int i=0; i<words.length; i++) {
        			if(!visited[i] && compareWord(temp.word, words[i])==1 ) {
        				queue.add(new Word(cnt+1, words[i]));
        				visited[i] = true;
        			}
        		}
        	}
        }else {
        	return 0;
        }
        
        return answer;
    }
    
    private static int compareWord(String s1, String s2) {
    	int cnt = 0;
    	for(int i=0; i<s1.length(); i++) {
    		if(s1.charAt(i) != s2.charAt(i)) {
    			cnt++;
    		}
    	}
    	return cnt;
    }
}