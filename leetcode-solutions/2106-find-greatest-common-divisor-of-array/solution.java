class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int big = nums[nums.length-1];
        while(big%small!=0){
            int rem = big%small;
            big = small;
            small = rem;
        }
        return small;
    }
}
