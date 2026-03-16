class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        boolean [] check = new boolean [21];
        Permutation(nums,check,  ll, l);
        

        return  l;
    }

    public static void Permutation(int [] nums, boolean [] check, List<Integer> ll, List<List<Integer>> l ){
        if(nums.length == ll.size()){
            l.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(check[nums[i]+10] == false){
                check[nums[i]+10] = true;
                ll.add(nums[i]);
                Permutation(nums, check, ll, l);
                ll.remove(ll.size()-1);
                check[nums[i]+10] = false;
            }
           
        }
    }
}
