class Solution {
    public int minimumSwaps(int[] nums) {
        int count_0 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0)count_0++;
        }
        int c = count_0;
        for(int i = nums.length-1; i>=nums.length-c; i--){
            if(nums[i]==0)count_0--;
        }
        return count_0;
    }
}
