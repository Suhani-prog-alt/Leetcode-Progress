class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        long km = 0;
        Arrays.sort(happiness);
        for(int i = happiness.length-1; i>=0; i--){
            long check = happiness[i]-km;
            if( check >= 0 && k>0 ){
                sum+=check;
                k--;
            }else{
                break;
            }
            km++;
        }
        return sum;
    }
}
