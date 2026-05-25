class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] arr = new int [100];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]-1]++;
        }
        int max = 0;
        for(int i = 0; i<100; i++){
            max = Math.max(arr[i],max);
        }
        int ans = 0;
        for(int i = 0; i<100;i++){
            if(arr[i] == max)ans++;
        }
        return ans*max;
    }
}
