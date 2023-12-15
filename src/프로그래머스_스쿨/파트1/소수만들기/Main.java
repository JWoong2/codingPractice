package 프로그래머스_스쿨.파트1.소수만들기;

class Main {
	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++)
			for (int j = i + 1; j < nums.length; j++)
				for (int k = j + 1; k < nums.length; k++)
					if (isPrime(nums[i] + nums[j] + nums[k]))
						answer++;
		return answer;
	}

	private boolean isPrime(int n) {
		final double sqrt = Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}