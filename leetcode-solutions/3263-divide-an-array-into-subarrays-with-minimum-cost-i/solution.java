class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length == 3) return nums[0]+nums[1]+nums[2];
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int idx = -1;
        for(int i = 1; i<nums.length; i++){
            if(min1>nums[i]){
                min1 = nums[i];
                idx = i;
            }
        }
        for(int i  = 1; i<nums.length; i++){
            if(idx!=i && min2>nums[i]){
                min2 = nums[i];
            }
        }
        return nums[0]+min1+min2;
    }
}
