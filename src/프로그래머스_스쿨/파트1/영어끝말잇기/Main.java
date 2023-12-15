package 프로그래머스_스쿨.파트1.영어끝말잇기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	  public int[] solution(int n, String[] words) {
          int[] answer ={0,0};
          
          List<String> list =new ArrayList<>();
          char last = words[0].charAt(0);
          int index = 0;

          for(int i=0; i < words.length; i++){
              if((last != words[i].charAt(0)) || list.contains(words[i])){
                  answer[0] = i%n+1;
                  answer[1] = i/n+1; 
                  
                      return answer; 
                  } 
              last = words[i].charAt(words[i].length() - 1);
              list.add(words[i]);
          }
          
          return answer;
      }
}