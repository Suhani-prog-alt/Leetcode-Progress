class Solution {
    public int findComplement(int num) {
        if(num == 0) return 1;
        int m = 0;
        while(Math.pow(2,m)<=num){
            m++;
        }
        return (int ) (Math.pow(2,m)-1-num);
    }
}
