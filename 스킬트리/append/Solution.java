package 스킬트리.append;

class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" });
		System.out.println(a);
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (String s : skill_trees) {
			StringBuilder filteredSkill = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				char skillName = s.charAt(i);
				if (skill.indexOf(skillName) < 0) {
					continue;
				}
				filteredSkill.append(skillName);
			}

			//아예 0인 경우
			if (filteredSkill.length() == 0) {
				answer++;
				continue;
			}

			//첫 글자가 같으며 skill의 문자열과 같은것
			if ((filteredSkill.charAt(0) == skill.charAt(0)) && skill.contains(filteredSkill))
				answer++;
		}

		return answer;
	}
}