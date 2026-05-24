class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int [] arr = new int [nums.length];
        int a = nums[0];
        arr[0] = a;
        int count = 1;
        int j = 1;
        for(int i = 1; i<nums.length; i++){
            if(count<k && nums[i]==a){
                arr[j++] = nums[i];
                count++;
            }else if(a!=nums[i]){
                arr[j++] = nums[i];
                a = nums[i];
                count = 1;
            }
        }

        int idx = 0;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                idx = i;
                break;
            }
        }
        int [] ans = new int [idx+1];
        for(int i= 0; i<ans.length; i++){
            ans[i] = arr[i];
        }
        return ans;
        
    }
}
