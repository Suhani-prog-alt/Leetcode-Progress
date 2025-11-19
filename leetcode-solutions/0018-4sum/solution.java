class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ll = new ArrayList<>();
        for(int i = 0; i<nums.length-3; i++){
            for(int j = i+1; j<nums.length-2; j++){
                int k = j+1;
                int m = nums.length-1;
                while(k<m){
                    List<Integer> l = new ArrayList<>();
                    long sum =(long)nums[i] + (long)nums[j] + (long)nums[k] + (long)nums[m];
                    if(sum==target){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        l.add(nums[m]);
                        ll.add(l);
                        k++;
                        m--;
                    }
                    else if(sum<target){
                        k++;
                    }else{
                        m--;
                    }
                }
            }
        }
        Set<List<Integer>> list = new HashSet<>(ll);
        List<List<Integer>> lii = new ArrayList<>(list);
        return lii;
    }
}
