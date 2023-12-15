package ���α׷��ӽ�.��������.����1.�޸������;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		String[] players = { "mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		solution2(players, callings);
	}
	
	public static String[] solution(String[] players, String[] callings) {
		List<String> tempArr = Arrays.asList(players);
		
        for(int i=0; i<callings.length; i++) {
        	int idx = tempArr.indexOf(callings[i]);
        	
        	String temp = players[idx-1];
        	
        	players[idx-1] = players[idx];
        	players[idx] = temp;
        }
        
        return players;
    }
	
	public static String[] solution2(String[] players, String[] callings) {
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<Integer, String> index = new HashMap<>();
		String[] answer = new String[players.length];		
		// init
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);
			index.put(i, players[i]);
		}
		
		for(int i=0; i<callings.length; i++) {
			String temp = callings[i]; // �Ҹ����
			int tempIdx = map.get(callings[i]); // �Ҹ���� index
			
			int fIdx = tempIdx-1; // �ռ� ���
			String ftemp = index.get(fIdx); // �ռ���� �̸�
			
			map.put(ftemp, tempIdx); // ������
			map.put(temp, fIdx); // 
			index.put(tempIdx, ftemp);
			index.put(fIdx, temp);
		}
		
		for(Entry<Integer, String> entry : index.entrySet()) {
			System.out.println(entry.getKey() + "  " +  entry.getValue());
			answer[entry.getKey()] = entry.getValue();
		}
		
        return answer;
    }
}
