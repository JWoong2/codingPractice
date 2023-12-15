package 프로그래머스_스쿨.파트1.스킬트리;

class Main {
	public static void main(String[] args) {
		int ans = solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"});
		
		System.out.println(ans);
	}
	
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (int i = 0; i < skill_trees.length; ++i) {
            String tree = "";
            int index=0;
            for (int j = 0; j < skill_trees[i].length(); ++j) {
            	for(char c : skill.toCharArray()) {
            		if (c == (skill_trees[i].charAt(j))) {
                        tree += skill_trees[i].charAt(j);
                        index++;
                    }	
            	}
            }

            if (skill.startsWith(tree)) {
                answer++;
            }
        System.out.println(tree);
        }

        return answer;
    }
}