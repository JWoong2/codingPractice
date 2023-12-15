package 스킬트리.user;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" });
		System.out.println(a);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		
		for(String s : skill_trees) {
			StringBuilder filteredSkill = new StringBuilder();
			
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(skill.indexOf(ch) < 0) continue;
				filteredSkill.append(ch);
			}
			
			if(filteredSkill.length() == 0 ) {
				answer++;
				continue;
			}
			
			if(filteredSkill.charAt(0) == skill.charAt(0) && skill.contains(filteredSkill)) {
				answer++;
				
			}
		}
		
		return answer;
	}
}