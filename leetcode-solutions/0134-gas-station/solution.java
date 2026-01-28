class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pos = -1;
        int count = 0;
        int total = 0;
        for(int i = 0; i< gas.length; i++){
            count+=(gas[i] - cost[i]);
            total+=(gas[i] - cost[i]);
            if(count<0){
                pos = i;
                count = 0;
            }
        }
        if(total>=0){
            return pos+1;
        }
        return -1;
    }
}
