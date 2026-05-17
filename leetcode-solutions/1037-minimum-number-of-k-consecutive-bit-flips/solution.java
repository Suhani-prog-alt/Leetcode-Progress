class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length, ans = 0;
        int times = 0;
        int [] flip = new int [n];
        for(int i = 0; i<n; i++){
            if(i>=k){
                times -= flip[i-k];
            }
            if((nums[i]==1 && times%2==1) || (nums[i] == 0 && times%2 == 0)){
                if(i+k > n) return -1;
                ans++;
                times++;
                flip[i]++;
            }
        }
        return ans;
    }
}
