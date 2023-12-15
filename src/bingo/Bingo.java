package bingo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<Character> alphabet = new ArrayList<Character>();
		Set<Character> wordSet = new HashSet<Character>();
		List<Integer> numList = new ArrayList<Integer>();
		int[] numbers = new int[25];
		Random rd = new Random();
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		while(numList.size() != numbers.length) {
			int temp = rd.nextInt(25)+1;
			System.out.println(temp);
			if(!numList.contains(temp)) numList.add(temp);
		}
		
		int index = 0;
		
		for(int i : numList) {
			index++;
			if(index == 5) {
				System.out.println(i);
				index = 0;
			}else {
				System.out.print(i + " ");
			}
		}
		
		System.out.println((int) 'a'); // A 65 Z 90 a  97
		
		for(int i=0; i<26; i++) {
			alphabet.add((char) (i+65));
			alphabet.add((char) (i+97)); 
		}
		
		String world = "����\r\n" + 
				"����\r\n" + 
				"���̾Ƴ�\r\n" + 
				"�����\r\n" + 
				"���׸���\r\n" + 
				"�׷�����\r\n" + 
				"�׸���\r\n" + 
				"���\r\n" + 
				"��Ϻ���\r\n" + 
				"������ī����� ��ȭ��\r\n" + 
				"���̺��\r\n" + 
				"�����\r\n" + 
				"����������\r\n" + 
				"������\r\n" + 
				"��������ī ��ȭ��\r\n" + 
				"������Ƽ��\r\n" + 
				"�״�����\r\n" + 
				"����\r\n" + 
				"�븣����\r\n" + 
				"��������\r\n" + 
				"������\r\n" + 
				"��ī���\r\n" + 
				"���ѹα�\r\n" + 
				"����ũ\r\n" + 
				"���̴�ī\r\n" + 
				"���̴�ī ��ȭ��\r\n" + 
				"����\r\n" + 
				"��Ƽ��\r\n" + 
				"�����\r\n" + 
				"���̺�����\r\n" + 
				"��Ʈ���\r\n" + 
				"���þ�\r\n" + 
				"���ٳ�\r\n" + 
				"������\r\n" + 
				"�縶�Ͼ�\r\n" + 
				"����θ�ũ\r\n" + 
				"���ϴ�\r\n" + 
				"�����\r\n" + 
				"�����ƴϾ�\r\n" + 
				"�����ٽ�Ÿ��\r\n" + 
				"���ٰ���ī��\r\n" + 
				"���� ����\r\n" + 
				"���ɵ��Ͼ� ��ȭ��\r\n" + 
				"������\r\n" + 
				"�����̽þ�\r\n" + 
				"����\r\n" + 
				"�߽���\r\n" + 
				"����\r\n" + 
				"�����\r\n" + 
				"�𸮼Ž�\r\n" + 
				"��Ÿ��\r\n" + 
				"�����ũ\r\n" + 
				"���׳ױ׷�\r\n" + 
				"������\r\n" + 
				"�����\r\n" + 
				"��Ÿ\r\n" + 
				"����\r\n" + 
				"�̱�\r\n" + 
				"�̾Ḷ\r\n" + 
				"��ũ�γ׽þ� ����\r\n" + 
				"�ٴ�����\r\n" + 
				"�ٷ���\r\n" + 
				"�ٺ��̵���\r\n" + 
				"��Ƽĭ �ñ�\r\n" + 
				"���ϸ�\r\n" + 
				"��۶󵥽�\r\n" + 
				"����\r\n" + 
				"���׼�����\r\n" + 
				"��Ʈ��\r\n" + 
				"���⿡\r\n" + 
				"����罺\r\n" + 
				"������\r\n" + 
				"�����Ͼ� �츣ü���\r\n" + 
				"�����ͳ�\r\n" + 
				"�������\r\n" + 
				"�η��\r\n" + 
				"�θ�Ű���ļ�\r\n" + 
				"��ź\r\n" + 
				"��Ű���ν�\r\n" + 
				"�Ұ�����\r\n" + 
				"�����\r\n" + 
				"��糪��\r\n" + 
				"����\r\n" + 
				"����ƶ���\r\n" + 
				"���϶� �ƶ� ���� ��ȭ��\r\n" + 
				"�긶����\r\n" + 
				"������ ��������\r\n" + 
				"���װ�\r\n" + 
				"�������\r\n" + 
				"���̼�\r\n" + 
				"����Ʈ��þ�\r\n" + 
				"����Ʈ��Ʈ �׷�����\r\n" + 
				"����ƮŰ�� �׺�\r\n" + 
				"�Ҹ�����\r\n" + 
				"�Ҹ�������\r\n" + 
				"�ַθ� ����\r\n" + 
				"����\r\n" + 
				"������\r\n" + 
				"������ī\r\n" + 
				"����������\r\n" + 
				"������\r\n" + 
				"������\r\n" + 
				"������\r\n" + 
				"���ι�Ű��\r\n" + 
				"���κ��Ͼ�\r\n" + 
				"�ø���\r\n" + 
				"�ÿ��󸮿�\r\n" + 
				"�̰�����\r\n" + 
				"�ƶ����̸�Ʈ\r\n" + 
				"�Ƹ��޴Ͼ�\r\n" + 
				"�Ƹ���Ƽ��\r\n" + 
				"���̽�����\r\n" + 
				"����Ƽ\r\n" + 
				"���Ϸ���\r\n" + 
				"������������\r\n" + 
				"�������Ͻ�ź\r\n" + 
				"�ȵ���\r\n" + 
				"�˹ٴϾ�\r\n" + 
				"������\r\n" + 
				"���Ͻ�\r\n" + 
				"�Ӱ��\r\n" + 
				"��Ƽ�� �ٺδ�\r\n" + 
				"����Ʈ����\r\n" + 
				"������Ͼ�\r\n" + 
				"���⵵��\r\n" + 
				"��Ƽ���Ǿ�\r\n" + 
				"����ٵ���\r\n" + 
				"����\r\n" + 
				"����\r\n" + 
				"����\r\n" + 
				"����Ʈ���ϸ���\r\n" + 
				"����Ʈ����\r\n" + 
				"�µζ�\r\n" + 
				"�丣��\r\n" + 
				"�찣��\r\n" + 
				"������\r\n" + 
				"���Ű��ź\r\n" + 
				"��ũ���̳�\r\n" + 
				"�̶�ũ\r\n" + 
				"�̶�\r\n" + 
				"�̽���\r\n" + 
				"����Ʈ\r\n" + 
				"��Ż����\r\n" + 
				"�ε�\r\n" + 
				"�ε��׽þ�\r\n" + 
				"�Ϻ�\r\n" + 
				"�ڸ���ī\r\n" + 
				"����\r\n" + 
				"���� ���\r\n" + 
				"�������������ιΰ�ȭ��\r\n" + 
				"������\r\n" + 
				"�߾Ӿ�����ī ��ȭ��\r\n" + 
				"��ȭ�α�\r\n" + 
				"��ȭ�ιΰ�ȭ��\r\n" + 
				"����Ƽ\r\n" + 
				"���ٺ��\r\n" + 
				"����\r\n" + 
				"ü��\r\n" + 
				"ĥ��\r\n" + 
				"ī�޷�\r\n" + 
				"ī��������\r\n" + 
				"ī���彺ź\r\n" + 
				"īŸ��\r\n" + 
				"į�����\r\n" + 
				"ĳ����\r\n" + 
				"�ɳ�\r\n" + 
				"�ڸ��\r\n" + 
				"�ڼҺ� ��ȭ��\r\n" + 
				"�ڽ�Ÿ��ī\r\n" + 
				"��Ʈ��ξƸ�\r\n" + 
				"�ݷҺ��\r\n" + 
				"��� ��ȭ��\r\n" + 
				"��� ���� ��ȭ��\r\n" + 
				"���\r\n" + 
				"�����Ʈ\r\n" + 
				"ũ�ξ�Ƽ��\r\n" + 
				"Ű���⽺��ź\r\n" + 
				"Ű���ٽ�\r\n" + 
				"Ű���ν�\r\n" + 
				"Ÿ��Ű��ź\r\n" + 
				"ź�ڴϾ�\r\n" + 
				"�±�\r\n" + 
				"��Ű\r\n" + 
				"���\r\n" + 
				"�밡\r\n" + 
				"����ũ�޴Ͻ�ź\r\n" + 
				"���߷�\r\n" + 
				"Ƣ����\r\n" + 
				"Ʈ�����Ͻ�Ʈ����\r\n" + 
				"Ʈ���ϴٵ� ��ٰ�\r\n" + 
				"�ĳ���\r\n" + 
				"�Ķ����\r\n" + 
				"��Ű��ź\r\n" + 
				"��Ǫ�ƴ����\r\n" + 
				"�ȶ��\r\n" + 
				"�ȷ���Ÿ��\r\n" + 
				"���\r\n" + 
				"��������\r\n" + 
				"������\r\n" + 
				"������\r\n" + 
				"����\r\n" + 
				"�ɶ���\r\n" + 
				"�ʸ���\r\n" + 
				"�밡��";
		String[] worldName = world.split("\r\n"); 
		
		
		while(set.size() != 25) {
			set.add(worldName[rd.nextInt(worldName.length)]);
		}
		
		/*
		 * Iterator<String> it = set.iterator(); int i=1; while(it.hasNext()) { if(i%5
		 * == 0) { System.out.print(i); i = 0; System.out.println(it.next()); }else {
		 * System.out.print(it.next()+ " "); } i++; }
		 * 
		 * while(wordSet.size() != 25) {
		 * wordSet.add(alphabet.get(rd.nextInt(alphabet.size()))); }
		 * 
		 * Iterator<Character> iter = wordSet.iterator(); i=1; while(iter.hasNext()) {
		 * if(i%5 == 0) { i = 0; System.out.println(iter.next()); }else {
		 * System.out.print(iter.next()+ " "); } i++; }
		 */
		
	}
}