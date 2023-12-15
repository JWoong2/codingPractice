package 카카오2020_2차.코테;

import java.util.ArrayList;
import java.util.List;

class Applicant {
	String language;
	String position;
	String career;
	String soulFood;
	int score;
	public Applicant(String language, String position, String career, String soulFood, int score) {
		super();
		this.language = language;
		this.position = position;
		this.career = career;
		this.soulFood = soulFood;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Applicant [language=" + language + ", position=" + position + ", career=" + career + ", soulFood="
				+ soulFood + ", score=" + score + "]";
	}
	
}

class Solution {
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[] test = solution(info, query);
		
		for(int i : test) {
			System.out.println(i);
		}
	}
	
	public static  int[] solution(String[] info, String[] query) {
		int[] answer = new int[info.length];
		
		List<Applicant> list = new ArrayList<Applicant>();
		
		for(int i=0; i<info.length; i++) {
			String[] detail = info[i].split(" ");
			list.add(new Applicant(detail[0], detail[1], detail[2], detail[3], Integer.parseInt(detail[4])));
		}
		
		for(int i=0; i<query.length; i++) {
			String[] detail = query[i].replace(" and", "").split(" ");
			
			for(int j=0; j<list.size(); j++) {
				if(detail[0].equals(list.get(j).language) || detail[0].equals("-")) {
					if(detail[1].equals(list.get(j).position) || detail[1].equals("-"))	{
						if(detail[2].equals(list.get(j).career) || detail[2].equals("-"))	{
							if(detail[3].equals(list.get(j).soulFood) || detail[3].equals("-"))	{
								if(Integer.parseInt(detail[4]) <= list.get(j).score || detail[4].equals("-"))	{
									answer[i]++;
								}
							}
						}
					}
				}
			}
			
			System.out.println();
		}
		
		return answer;
	}
}