package 힙.라면공장;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void solution() {
		Assert.assertEquals(new Solution().solution(4, new int[] {4,10,15}, new int[] {20, 5, 10},30), 2);
	}

}
