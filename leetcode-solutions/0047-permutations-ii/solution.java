class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> ll = new ArrayList<>();
        int [] arr = new int [21];
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]+10]++;
        }

        int [] check = new int [21];
        Permutation(nums,arr, check,  ll, ans);
        
        return new ArrayList<>(ans);
    }

    public static void Permutation(int [] nums, int [] arr, int [] check, List<Integer> ll, Set<List<Integer>> l ){
        if(nums.length == ll.size()){
            l.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(!(check[nums[i]+10] == arr[nums[i]+10])){
                check[nums[i]+10]++;
                ll.add(nums[i]);
                Permutation(nums, arr, check, ll, l);
                ll.remove(ll.size()-1);
                check[nums[i]+10]--;
            }
           
        }
    
    }
}
