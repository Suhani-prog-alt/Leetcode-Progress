class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[i] = sum(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public static int sum(int n){
        int s = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            s+=rem;
        }
        return s;
    }
}
