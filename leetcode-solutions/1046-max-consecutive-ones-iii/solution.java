class Solution {
    public int longestOnes(int[] nums, int k) {
        int si = 0, ei = 0, ans = 0, flip = 0;
        while(ei<nums.length){
            //grow
            if(nums[ei]==0){
                flip++;
            }
            //shrink
            while(flip>k && si<=ei){
                if(nums[si]==0){
                    flip--;
                }
                si++;
            }
            //update
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}
