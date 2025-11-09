class Solution {
    public int[] singleNumber(int[] nums) {
        int [] arr = new int [2];
        Arrays.sort(nums);
        int j = 0;
        for(int i = 0; i<nums.length - 1; i++){
            if(nums[i]==nums[i+1]){
                i++;
            }
            else{
                arr[j] = nums[i];
                j++;
            }
            if(i==nums.length-2){
                if(nums[nums.length-2]!=nums[nums.length-1] && j<2){
                    arr[j] = nums[nums.length-1];
                }
            }
        }
        return arr;
    }
}
