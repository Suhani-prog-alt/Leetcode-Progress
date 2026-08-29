class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        int ans =0;
        int[] dem = nums;
        for(int r =-1; r< n; r++){

            int size =(r== -1) ? n : n - 1;
            int[] arr = new int[size];
            int k = 0;
            for(int i = 0; i<n; i++){
                if(i!=r){
                    arr[k++] =dem[i];
                }
            }
            int[] pre= new int[size];
            int[] suf= new int[size];

            pre[0] =arr[0];
            for(int i =1; i<size; i++){
                pre[i] =gcd(pre[i - 1],arr[i]);
            }
            suf[size-1] = arr[size-1];
            for(int i =size-2; i>= 0; i--){
                suf[i] = gcd(suf[i + 1], arr[i]);
            }
            int count = 0;
            for(int i =0; i< size-1; i++){
                if(pre[i] == suf[i+1]){
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
