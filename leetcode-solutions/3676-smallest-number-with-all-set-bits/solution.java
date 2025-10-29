class Solution {
    public int smallestNumber(int n) {
        if (n == 1) return 1;
        int i = 1;
        while(true){
            if(n<Math.pow(2,i)){
                return (int)Math.pow(2,i) - 1;
            }
            i++;
        }
    }
}
