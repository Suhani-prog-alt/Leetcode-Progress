class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> l = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int j = 2;
            while(nums[i]>0 && j<=nums[i]){
                if(nums[i]%j==0){
                    l.add(j); 
                    nums[i] /=j;
                    j--;
                }
                j++;
            }
        }
        return l.size();
    }

}
