class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        return validTriangle(nums);
    }

    public static int validTriangle(int [] nums){
        int count = 0;
        for(int i = 2; i<nums.length; i++){
            int k = 0;
            int j = i-1;
            while(k<j){
                if( nums[k] + nums[j] > nums[i]){
                    count+= j-k;
                    j--;                    
                }
                else{
                    k++;
                }
            }
        }
        return count;
    }
}

