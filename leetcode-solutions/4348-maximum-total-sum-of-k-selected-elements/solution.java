class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum = 0;
        Arrays.sort(nums);
        for(int i = nums.length-1; i>=0; i--){
            if(k>0){
                sum+=((long)(long)mul*nums[i]);
                if(mul>1){
                    mul--;
                }
                k--;
            }else{
                break;
            }
        }
        return sum;
    }
}
