class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int d = nums[nums.length-1];
        for(int i = 0; i<nums.length-1; i++){
            sum = sum + (d-nums[i]);
        }
        return sum;
    }
}
