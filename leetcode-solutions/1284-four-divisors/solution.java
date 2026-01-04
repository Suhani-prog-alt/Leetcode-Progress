class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum_4 = 0;
        int sum = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 2; j<=nums[i]/2; j++){
                if(nums[i]%j==0){
                    sum+=j;
                    count+=1;
                }
                if(count>4){
                    break;
                }
            }
            if(count==2){
                sum_4+=sum;
                sum_4+=(1+nums[i]);
            }
            sum = 0;
            count = 0;
        }
        return sum_4;
    }
}
