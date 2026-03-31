class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);
        subset(l, ll, nums, nums.length-1);
        // Set<List<Integer>> s = new ArrayList<>(Arrays.asList(l));
        return l;
    }

    public static void subset(List<List<Integer>> l, List<Integer> ll, int [] nums, int idx){
        if(idx < 0){
            if(!l.contains(ll)){
                l.add(new ArrayList<>(ll));
            }
            
            return;
        }

        // not adding
        subset(l, ll, nums, idx-1);

        //adding
        ll.add(nums[idx]);
        subset(l, ll, nums, idx-1);
        ll.remove(ll.size()-1);
    }
}
