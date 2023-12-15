package 백준.다이나믹;

public class DynamicProgramming {
	int n = 0;
	int dp[] = new int[n];
	// Top down 
	int Topfibonacci(int n)
	{
	    if (n == 0) return 0;
	    if (n == 1) return 1;
	 
	    if (dp[n] != -1) return dp[n];
	 
	    dp[n] = Topfibonacci(n - 1) + Topfibonacci(n - 2);
	    return dp[n];
	}

	// Bottom up
	void Bottomfibonacci(int n)
	{
	    dp[0] = 0;
	    dp[1] = 1;
	    for (int i = 2; i <= n; i++)
	        dp[i] = dp[i - 1] + dp[i - 2];
	}
}
