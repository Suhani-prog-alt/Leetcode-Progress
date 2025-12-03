class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=0 && nums[i] > 0; i--){
            for(int j = 0; j<nums.length && nums[j]<0; j++){
                
                if(Math.abs(nums[j])==nums[i]) return nums[i];
                if(Math.abs(nums[j])<nums[i]) break;
            }
        }
        return -1;
    }
}
