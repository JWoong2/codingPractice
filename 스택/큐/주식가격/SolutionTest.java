package ����.ť.�ֽİ���;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SolutionTest {

	@Test
	void solution() {
		Assert.assertEquals(new Solution().solution(new int[] {1,2,3,2,3}), new int[] {4,3,1,1,0});
	}

}
