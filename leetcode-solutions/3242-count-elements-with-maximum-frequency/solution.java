class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] fre = new int [100];
        for(int i = 0; i<nums.length; i++){
            fre[nums[i]-1]++;
        }
        int mx = 0;
        for(int i  = 0; i<100; i++){
            mx = Math.max(mx, fre[i]);
        }
        int ans = 0;
        for(int i = 0;i<100; i++){
            if(mx == fre[i]){
                ans+=mx;
            }
        }
        return ans;
    }
}
