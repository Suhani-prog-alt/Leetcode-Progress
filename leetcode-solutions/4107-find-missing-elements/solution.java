class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll = new ArrayList<>();
        int ans = 0;
        int count = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]+1!=nums[i]){
                ans = nums[i-1]+1;
                count = nums[i]-nums[i-1]-1;
                change(ll, count, ans);
            }
        }
        return ll;
    }

    public static void change( List<Integer> ll, int count, int ans){
        for(int i = 0; i<count; i++) {
            ll.add(ans);
            ans++;
        }
        
    }
}
