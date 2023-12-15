package 카카오2019_겨울.불량사용자;

import java.util.HashSet;
import java.util.regex.Pattern;

class Solution {
	static String[] userId;
	static String[] bannedRegex;
	static boolean[] checked;
	static HashSet<HashSet<Integer>> resultSet;

	public static void main(String[] args) {
		String[] user = { "frodo", "fradi", "crodo", "abc123", "frodoc" };
		String[] bann = { "fr*d*", "abc1**" };

		int a = solution(user, bann);
		System.out.println(a);
	}

	public static int solution(String[] user_id, String[] banned_id) {
		userId = user_id;
		checked = new boolean[user_id.length];
		resultSet = new HashSet<>();
		bannedRegex = new String[banned_id.length];
		for (int i = 0; i < banned_id.length; i++) {
			bannedRegex[i] = banned_id[i].replace("*", ".");
		}

		dfs(0, new HashSet<>());
		
		return resultSet.size();
	}

	private static void dfs(int index, HashSet<Integer> set) {
		if (index == bannedRegex.length) {
			resultSet.add(set);
			return;
		}

		for (int i = 0; i < userId.length; i++) {
			if (Pattern.compile(bannedRegex[index]).matcher(userId[i]).matches() && !checked[i]) {
				checked[i] = true;
				set.add(i);

				dfs(index + 1, new HashSet<>(set));
				checked[i] = false;
				set.remove(i);
			}
		}
	}
}