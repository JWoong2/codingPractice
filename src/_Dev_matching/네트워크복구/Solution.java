package _Dev_matching.네트워크복구;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//	XX 시에는 네트워크 망이 있습니다. 어느 날 악천후로 인하여 몇몇 PC 사이의 네트워크 연결이 끊어지게 되었습니다. 끊어진 네트워크 연결을 복구하여 모든 PC 간 통신이 가능하게 하려 합니다. 이때 필요한 최소한의 비용을 구해주세요.
//
//	a번 PC부터 b번 PC까지 도달하는 경로가 존재할 때, a번 PC와 b번 PC가 통신이 가능하다고 합니다.
//
//	전체 PC 수 n, 현재 네트워크 망 배열 network, 복구하려는 네트워크 배열 repair 가 주어졌을 때, 복구하는데 드는 최소 비용을 return 하도록 solution 함수를 작성해주세요.
//
//	제한사항
//	n은 3 이상 100,000 이하인 정수입니다.
//	network와 repair의 길이는 1 이상 300,000 이하입니다.
//	network의 원소는 [a, b] 형태이며, 이는 a번 PC와 b번 PC가 연결되어 있다는 뜻입니다.
//	a와 b는 1 이상 n 이하인 정수입니다.
//	a와 b가 같은 경우는 없습니다.
//	repair의 원소는 [a, b, cost] 형태이며, 이는 a번 PC와 b번 PC의 네트워크 연결을 복구하는데 cost만큼 비용이 든다는 뜻입니다.
//	a와 b는 1 이상 n 이하인 정수입니다.
//	a와 b가 같은 경우는 없습니다.
//	cost는 1 이상 100,000 이하인 정수입니다.
//	network, repair를 모두 포함해서 서로 다른 PC 사이에 두 개 이상의 네트워크 연결이 있는 경우는 없습니다.
//	모든 PC 간 통신이 불가능한 경우 -1을 return 해주세요.
//	입출력 예
//	n	network	repair	return
//	6	[[1, 2], [3, 5], [4, 2], [5, 6]]	[[3, 2, 10], [5, 4, 15]]	10
//	4	[[1, 2]]	[[2, 3, 10], [3, 1, 12]]	-1
	
	class Graph {
		int x,y;
		int value;

		public Graph(int x, int y, int value) {
			super();
			this.x = x;
			this.y = y;
			this.value = value;
		}
		
	}
	
    public int solution(int n, int[][] network, int[][] repair) {
        int answer = -2;
        
        List<Graph> list = new ArrayList<Solution.Graph>();
        
        for(int i=0; i<network.length; i++) {
        	list.add(new Graph(network[i][0], network[i][1], 0));
        	list.add(new Graph(network[i][1], network[i][0], 0));
        }
        
        for(int i=0; i<repair.length; i++) {
        	list.add(new Graph(repair[i][0], repair[i][1], repair[i][2]));
        	list.add(new Graph(repair[i][1], repair[i][0], repair[i][2]));
        }
        
        
        
        return answer;
    }
}
