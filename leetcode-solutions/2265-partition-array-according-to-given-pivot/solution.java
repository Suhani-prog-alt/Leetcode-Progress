class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] arr = new int [nums.length];
        int i = 0, left = 0; 
        int j = nums.length -1, right = nums.length -1;
        while(i<nums.length){
            if(nums[i]<pivot){
                arr[left++] = nums[i];
            }
            if(nums[j]>pivot){
                arr[right--] = nums[j];
            }
            i++;
            j--;
        }
        while(left<=right){
            arr[left++] = pivot;
        }
        return arr;
    }
}
