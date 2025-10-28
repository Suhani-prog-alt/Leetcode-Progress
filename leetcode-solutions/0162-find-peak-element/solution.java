class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i<nums.length; i++){
            if(max<nums[i]) {
                idx = i;
                max = nums[i];
            }
        }
        return idx;
    }
}
