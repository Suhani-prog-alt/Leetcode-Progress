class Solution {
    public int smallestNumber(int n, int t) {
        while(!(mul(n)%t==0)){
            n+=1;
        }
        return n;
    }

    public int mul(int n){
        int m = 1;
        while(n>0){
            int rem = n%10;
            n/=10;
            m*=rem;
        }
        return m;
    }
}
