class Solution {
    public boolean isPowerOfThree(int n) {
        boolean ans = false;
        while(n%3==0 && n!=0){
            n/=3;
        }
        if(n==1) return true;
        if(n==0) return false;
        return ans;
    }
}
