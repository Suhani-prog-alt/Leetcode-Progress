class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if(i+2<nums.length && nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                i+=2;
                // System.out.print(i+","+nums[i]);
                continue;
            }
            else{
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}
