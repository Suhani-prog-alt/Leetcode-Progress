class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int mid = nums[(nums.length-1)/2];
        if(mp.get(mid)==1)return true;
        return false;
    }
}
