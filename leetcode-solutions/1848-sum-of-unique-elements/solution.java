class Solution {
    public int sumOfUnique(int[] nums) {
        int [] arr = new int [100];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]-1]++;
        }
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==1){
                sum+=(i+1);
            }
        }
        return sum;
    }
}
