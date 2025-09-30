class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
                continue;
            }
            else{
                ans = nums[i];
                break;
            }
        }
        return ans ;
    }
}
