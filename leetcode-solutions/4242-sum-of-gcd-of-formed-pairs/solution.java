class Solution {
    public long gcdSum(int[] nums) {
        int [] mx = new int [nums.length];
        mx[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            mx[i] = Math.max(nums[i], mx[i-1]);
        }
        int [] prefix = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            prefix[i] = PrefixGcd(mx[i], nums[i]);
        }

        // sum

        long sum = 0;
        Arrays.sort(prefix);
        int i = 0;
        int j = nums.length -1;
        while(i<j){
            sum+=PrefixGcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
    }

    public static int PrefixGcd(int divisor, int dividend){
        while(divisor!= 0 && dividend% divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
}
