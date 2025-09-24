class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        return missing(nums);
    }

    public static int missing(int [] nums){
        int n = nums[0];
        if(n==0){
            for(int i = 1; i<nums.length; i++){
                if(n + 1 == nums[i]){
                    n = nums[i];
                }
            else{
                return n+1;
            }
        }
        }
        else{
            return 0;
        }
        return nums[nums.length-1] + 1;
    }
}
