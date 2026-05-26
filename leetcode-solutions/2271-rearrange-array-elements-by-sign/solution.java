class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i =0 ;i <nums.length; i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }
        int [] ans = new int [nums.length];
        int j = 0, k = 0;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                ans[i] = pos.get(j++);
            }else{
                ans[i] = neg.get(k++);
            }
        }
        return ans;
    }
}
