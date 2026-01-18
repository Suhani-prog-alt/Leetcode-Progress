class Solution {
    public int alternateDigitSum(int n) {
        int len = 0;
        int m = n;
        while(n>0){
            len++;
            n/=10;
        }

        int [] arr = new int [len];
        for(int i = len-1; i>=0; i--){
            arr[i] = m%10;
            m/=10;
        }
        int sum = 0;
        for(int i = 0; i<len; i++){
            if(i%2==0){
                sum+=arr[i];
            }else{
                sum-=arr[i];
            }
        }
        return sum;
    }
}
