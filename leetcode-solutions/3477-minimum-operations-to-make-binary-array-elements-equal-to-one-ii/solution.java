class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            if((nums[i]==1 && ans%2 == 0) || (nums[i] == 0 && ans%2!=0)){
                continue;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
