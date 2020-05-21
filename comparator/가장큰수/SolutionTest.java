package comparator.가장큰수;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SolutionTest {

	@Test
	void solution() {
		Assert.assertEquals(new Solution().solution(new int[] { 6, 2, 10 }), "6210");
		Assert.assertEquals(new Solution().solution(new int[] { 3, 30, 34, 5, 9 }), "9534330");
	}

}
