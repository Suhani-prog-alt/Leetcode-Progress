class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        
        pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        for(int i= 1; i<n; i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        for(int i=n-2; i>=0; i--){
            suf[i]=Math.max(suf[i+1],nums[i]);
        }

        int ans=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(i-k>=0){
                ans=Math.max(ans, nums[i] +pre[i-k]);
            }
            if(i+k<n){
                ans=Math.max(ans, nums[i] +suf[i+k]);
            }
        }
        return ans;
    }
}
