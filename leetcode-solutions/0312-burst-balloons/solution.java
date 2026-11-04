class Solution {
    public int maxCoins(int[] arr) {
       int [] a = new int[arr.length+2];
		a[0] = a[a.length-1] = 1;
		for(int i = 0; i<arr.length; i++) {
			a[i+1] = arr[i];
		} 
        int [][]dp = new int [a.length][a.length];
		for(int [] a1: dp) {
			Arrays.fill(a1, -1);
		}
        return max_Coins(a, 0, a.length-1,dp);
    }

    public static int max_Coins(int [] nums, int si, int ei, int [][] dp) {
		if(si+1 == ei)return 0;
		
		if(dp[si][ei]!=-1) {
			return dp[si][ei];
		}
		int ans = Integer.MIN_VALUE;
		
		for(int i = si+1; i<ei; i++) {
			int l = max_Coins(nums, si, i, dp);
			int r = max_Coins(nums, i, ei,dp);
			int s = nums[si] * nums[i]*nums[ei];
			int t = l+r+s;
			ans = Math.max(ans, t);
		}
		return  dp[si][ei] = ans;
	}
}
