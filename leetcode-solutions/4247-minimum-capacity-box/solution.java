class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int res = -1;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<capacity.length; i++){
            if( max> capacity[i] && capacity[i] >= itemSize){
                max = capacity[i];
                res = i;
            }
        }
        return res;
    }
}
