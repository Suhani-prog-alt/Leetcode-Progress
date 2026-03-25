class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        sub(l, ll, nums.length-1, nums);
        return l;
    }

    public static void sub(List<List<Integer>> l, List<Integer> ll, int idx, int [] nums){
        if(idx < 0){
            l.add(new ArrayList<>(ll));
            return;
        }
        // not add
        int a = nums[idx];
        sub(l, ll, idx-1, nums);

        //add
        ll.add(a);
        sub(l, ll,idx-1, nums );
        ll.remove(ll.size()-1);
    }

}
