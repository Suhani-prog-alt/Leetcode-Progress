class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                List<Integer> l = new ArrayList<>();
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    ll.add(l);
                    j++;
                    k--;
                }
               
            }
        }
        Set<List<Integer>> list = new HashSet<>(ll);
        List<List<Integer>> liist = new ArrayList<>(list);
        return liist;
    }
}
