class Solution {
    public int minimumCost(int[] cost) {
        int c = 0;
        Arrays.sort(cost);
        for(int i = cost.length-1; i>=0; i-=3){
            if(i-1>=0)c+=(cost[i]+cost[i-1]);
            else if(i>=0)c+=cost[i];
        }
        return c;
    }
}
