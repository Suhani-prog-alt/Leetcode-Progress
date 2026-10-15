class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
		int [] dp = new int [n];
		dp[0] = arr[0];
		int len = 1;
		for(int i = 1; i<arr.length; i++) {
			if(dp[len-1] < arr[i]) {
				dp[len] = arr[i];
				len++;
			}else{
				int idx = BinarySearch(dp, 0, len-1, arr[i]);
				dp[idx] = arr[i];
			}
		}
        return len;
	}
	
	public static int BinarySearch(int [] dp, int i, int j, int num) {
		int ans = 0;
		while(j>=i) {
			int mid = (j+i)/2;
			if(num<=dp[mid]) {
				ans = mid;
				j = mid-1;
			}else {
				i = mid+1;
			}
		}
		return ans;
	
    }
}
