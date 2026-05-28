class Solution {
    public int[] decrypt(int[] code, int k) {
        int [] ans = new int [code.length];
        if(k == 0) return ans;
        else if (k>0){
            int sum = 0;
            for(int i = 1; i<=k; i++){
                sum+=code[i];
            }
            int j = k+1;
            for(int i = 0; i<code.length; i++){
                ans[i] = sum;
                sum-=code[(i+1)%code.length];
                sum+=code[(j)%code.length];
                j++;
            }
        }else{
            int sum = 0;
            for(int i = code.length-1; i>=code.length+k; i--){
                sum+=code[i];
            }
            
            for(int i = 0; i<code.length; i++){
                ans[i] = sum;
                sum-=code[(code.length+k)%code.length];
                sum+=code[(i)%code.length];
                k++;
            }
        }
        return ans;
    }
}
