class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int j = nums.length-1;
            while(i<j){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
                j--;
            }
        }
        return count;
    }
}
