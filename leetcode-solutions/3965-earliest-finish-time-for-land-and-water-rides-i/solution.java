class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<landStartTime.length; i++){
            for(int j = 0; j<waterStartTime.length; j++){
                if(landStartTime[i]+landDuration[i] <waterStartTime[j]){
                    int x = waterStartTime[j] - (landStartTime[i]+landDuration[i] );
                    ans = Math.min(ans, landStartTime[i]+landDuration[i]+waterDuration[j]+x);
                }else{
                    ans = Math.min(ans, landStartTime[i]+landDuration[i]+waterDuration[j]);
                }
                
            }
        }
        for(int i = 0; i<waterStartTime.length; i++){
            for(int j = 0; j<landStartTime.length; j++){
                if(waterStartTime[i]+waterDuration[i] <landStartTime[j] ){
                    int x = landStartTime[j] - (waterStartTime[i]+waterDuration[i] );
                    ans = Math.min(ans, waterStartTime[i]+waterDuration[i]+landDuration[j]+x);
                }else{
                    ans = Math.min(ans, waterStartTime[i]+waterDuration[i]+landDuration[j]);
                }
                
            }
        }
        return ans;
    }
}
