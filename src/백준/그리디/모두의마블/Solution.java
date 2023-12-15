package 백준.그리디.모두의마블;

import java.util.*;
import java.io.*;

public class Solution {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		String str1[] = br.readLine().split(" ");
		int max = 0;
		int result = 0;
		
		for (int i = 0; i < str1.length; i++) {
			int level = Integer.parseInt(str1[i]);
		
			if (max < level) {
				max = level;
			}
			result += level;

			System.out.println(result);
		}
		result += max * (str1.length - 2);
		
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
