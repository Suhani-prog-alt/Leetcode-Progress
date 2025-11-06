class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int si = 0, ei = 0, ans = 0;
        while(ei<nums.length){
            if(nums[ei]==0){
                ans = Math.max(ans,ei-si);
                si = ei+1;
            }
            ei++;
        }
        ans = Math.max(ans,ei-si);
        return ans;
    }
}
