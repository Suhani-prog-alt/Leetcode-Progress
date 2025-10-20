class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while(true){
            n-=i;
            i++;
            count++;
            if(n<i){
                break;
            }
        }
        return count;
    }
}
