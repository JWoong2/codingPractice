package _Dev_matching.��Ʈ��ũ����;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//	XX �ÿ��� ��Ʈ��ũ ���� �ֽ��ϴ�. ��� �� ��õ�ķ� ���Ͽ� ��� PC ������ ��Ʈ��ũ ������ �������� �Ǿ����ϴ�. ������ ��Ʈ��ũ ������ �����Ͽ� ��� PC �� ����� �����ϰ� �Ϸ� �մϴ�. �̶� �ʿ��� �ּ����� ����� �����ּ���.
//
//	a�� PC���� b�� PC���� �����ϴ� ��ΰ� ������ ��, a�� PC�� b�� PC�� ����� �����ϴٰ� �մϴ�.
//
//	��ü PC �� n, ���� ��Ʈ��ũ �� �迭 network, �����Ϸ��� ��Ʈ��ũ �迭 repair �� �־����� ��, �����ϴµ� ��� �ּ� ����� return �ϵ��� solution �Լ��� �ۼ����ּ���.
//
//	���ѻ���
//	n�� 3 �̻� 100,000 ������ �����Դϴ�.
//	network�� repair�� ���̴� 1 �̻� 300,000 �����Դϴ�.
//	network�� ���Ҵ� [a, b] �����̸�, �̴� a�� PC�� b�� PC�� ����Ǿ� �ִٴ� ���Դϴ�.
//	a�� b�� 1 �̻� n ������ �����Դϴ�.
//	a�� b�� ���� ���� �����ϴ�.
//	repair�� ���Ҵ� [a, b, cost] �����̸�, �̴� a�� PC�� b�� PC�� ��Ʈ��ũ ������ �����ϴµ� cost��ŭ ����� ��ٴ� ���Դϴ�.
//	a�� b�� 1 �̻� n ������ �����Դϴ�.
//	a�� b�� ���� ���� �����ϴ�.
//	cost�� 1 �̻� 100,000 ������ �����Դϴ�.
//	network, repair�� ��� �����ؼ� ���� �ٸ� PC ���̿� �� �� �̻��� ��Ʈ��ũ ������ �ִ� ���� �����ϴ�.
//	��� PC �� ����� �Ұ����� ��� -1�� return ���ּ���.
//	����� ��
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
