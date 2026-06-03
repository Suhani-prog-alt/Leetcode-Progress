class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int [] land = new int [landStartTime.length];
        for(int i = 0; i<landStartTime.length; i++){
            land[i] = landStartTime[i] + landDuration[i];
        }
        Arrays.sort(land);
        int land_ans = land[0];
        int ans = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<waterStartTime.length; i++){
            max = Math.max(land_ans,waterStartTime[i] )+waterDuration[i];
            ans = Math.min(ans, max);
        }
        int [] water = new int [waterDuration.length];
        for(int i = 0; i<waterDuration.length; i++){
            water[i] = waterDuration[i]+waterStartTime[i];
        }
        Arrays.sort(water);
        int water_ans = water[0];
        max = 0;
        for(int  i = 0; i<landStartTime.length; i++){
            max = Math.max(water_ans, landStartTime[i])+landDuration[i];
            ans = Math.min(ans, max);
        }
        return ans;
    }
}
