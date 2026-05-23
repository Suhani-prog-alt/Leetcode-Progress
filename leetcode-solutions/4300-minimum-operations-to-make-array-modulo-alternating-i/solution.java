class Solution {
    public int minOperations(int[] nums, int k) {
        int Ans = Integer.MAX_VALUE;
        for(int x=0; x<k; x++){
            for(int y=0; y<k; y++){
                if(x == y) continue;
                int cur_=0;
                for(int i=0; i<nums.length; i++){
                    int rem=nums[i] % k;
                    int tar=(i % 2 == 0) ? x : y;
                    int dif=Math.abs(rem - tar);
                    cur_+=Math.min(dif, k - dif);
                }
                Ans=Math.min(Ans, cur_);
            }
        }
        return Ans;
    }
}
