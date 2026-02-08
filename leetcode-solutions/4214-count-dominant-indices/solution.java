class Solution {
    public int dominantIndices(int[] nums) {
        int []  dom = new int [nums.length];
        dom[nums.length-1] = 0;
        for(int i = nums.length-2; i>=0; i--){
            dom[i] = dom[i+1] + nums[i+1];
        }

        int count = 0;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] > (dom[i]/(nums.length - 1- i))){
                count++;
            }
        }
        return count;
    }
}
