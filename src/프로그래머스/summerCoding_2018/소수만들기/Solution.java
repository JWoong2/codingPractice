package 프로그래머스.summerCoding_2018.소수만들기;

class Solution {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		System.out.println("정답은 이거다 : " +  solution(nums));
	}
	
	
	static boolean[] visited;
	static int num = 0;
	
    public static int solution(int[] nums) {
        int answer = 0;

        visited = new boolean[nums.length];
        
        dfs(0, nums);

        answer = num;
        
        return answer;
    }
    
    public static void dfs(int sum, int[] nums) {
    	
    	if(isPrime(sum)) {
    		System.out.println(sum);
    		num++;
    	}
    	
    	for(int i=0; i<nums.length; i++) {
        	if(visited[i]) continue;
        	visited[i] = true;

        	dfs(sum+nums[i], nums);
        	
        	visited[i] = false;
        }
    	
    }
    
    public static boolean isPrime(int num) {
    	if(num < 2) return false;
    	
    	for(int i=2; i<num; i++) {
    		if(num % i == 0) return false;
    	}
    	
    	return true;
    }
}