class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int [] res = new int [len];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                int l = i + nums[i];
                if(l < 0){
                    l = Math.abs(l);
                    l%=len;
                    l = len -l;
                }
                res[i] = nums[l%len];
            }else{
                res[i] = nums[i];
            }
        }
        return res;
    }
}
