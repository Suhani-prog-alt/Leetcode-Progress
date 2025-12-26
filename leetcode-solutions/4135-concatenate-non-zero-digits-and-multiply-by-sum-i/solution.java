class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long val = 0;
        long mul = 1;
        while(n>0){
            int r = n%10;
            n = n/10;
            if(r!=0){
                sum+=r;
                val = val + r*mul;
                mul*=10;
            }
        }
        return val*sum;
    }
}
