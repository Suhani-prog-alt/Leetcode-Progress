class Solution {
    public int[] searchRange(int[] nums, int target) {
        int str = -1;
        int end = -1;
        int count = -1;
        int [] arr = new int [2];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                str = i;
                count++;
                if(i ==  nums.length-1){
                    end = i;
                }
            }else if(nums[i]>target){
                end = i-1;
                break;
            }
        }

        if(str == -1 ){
            arr[0] = -1;
            arr[1] = -1;
        }else{
            arr[0] = str-count;
            if(count+1 == nums.length){
                arr[1] = arr[0]+count;
            }else{
                arr[1] = end;
            }
            
        }
        return arr;
    }
}
