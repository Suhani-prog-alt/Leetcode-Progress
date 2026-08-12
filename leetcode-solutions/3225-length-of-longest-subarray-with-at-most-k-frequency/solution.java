class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0, j=0;
        Map<Integer, Integer> mp = new HashMap<>();
        int ans = 0;
        while( j!=nums.length){
            // inc
            mp.put(nums[j], mp.getOrDefault(nums[j],0)+1);

            // shrink
            while(mp.get(nums[j])>k && i<=j){
                mp.put(nums[i], mp.get(nums[i])-1);
                if(mp.get(nums[j])<0)mp.put(nums[j],0);
                i++;
            }

            // update
            ans = Math.max(ans, j-i+1);
            j++;
            
        }
        return ans;

    }
}
