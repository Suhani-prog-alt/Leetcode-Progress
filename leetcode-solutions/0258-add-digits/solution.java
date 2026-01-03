class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int n = num;
        while(n>=10){
            int rem = num%10;
            sum+=rem;
            num/=10;
            if(num==0){
                n = sum;
                num = sum;
                sum = 0;
            }
        }
        return n;
    }
}
