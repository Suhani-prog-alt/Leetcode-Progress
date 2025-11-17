class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean ans = true;
        int count = 0;
        int j =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                 j = i;
                 break;
            }
        }
        for(int i = j; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            else{
                if(count<k && i!=j){
                    ans = false;
                    break;
                }
                count = 0;
            }
        }
        return ans;
    }
}
