class Solution {
    public int bitwiseComplement(int n) {
        if(n  == 0) return 1;
        int m = 0;
        while(Math.pow(2,m)<=n){
            m++;
        }
        return (int) (Math.pow(2,m) - 1- n);
    }
}
