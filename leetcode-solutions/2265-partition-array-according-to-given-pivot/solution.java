class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> small = new ArrayList<>();
        List<Integer> eq = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if( nums[i] < pivot){
                small.add(nums[i]);
            }else if(nums[i] == pivot){
                eq.add(nums[i]);
            }else{
                big.add(nums[i]);
            }
        }
        int i = 0;
        for(int idx : small){
            nums[i++] = idx;
        }
        for(int idx : eq){
            nums[i++] = idx;
        }
        for(int idx : big){
            nums[i++] = idx;
        }
        return nums;
    }

    
}
