class Solution {
    public int minFallingPathSum(int[][] grid) {
        int [][]dp = new int [grid.length][grid[0].length];
		for(int [] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i<grid[0].length; i++) {
			ans = Math.min(ans, Minimum_Falling_Path2(grid, 0, i, dp));
		}
        return ans;
    }
    public static int Minimum_Falling_Path2(int [][]matrix, int cr, int cc, int [][]dp) {
		if(cr == matrix.length -1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=-1000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for(int col = 0; col<matrix[0].length; col++) {
			if(col!=cc) {
				ans = Math.min(ans,  Minimum_Falling_Path2(matrix, cr+1, col, dp));
			}
		}
		return dp[cr][cc] = ans + matrix[cr][cc];
	}
}
