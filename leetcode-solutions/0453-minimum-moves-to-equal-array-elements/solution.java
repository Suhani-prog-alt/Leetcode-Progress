class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            max = Math.min(max, nums[i]);
        }
        int ans = 0;
        for(int i =0; i<nums.length; i++){
            ans+=(nums[i]) - max;
        }
        return ans;
    }
}
