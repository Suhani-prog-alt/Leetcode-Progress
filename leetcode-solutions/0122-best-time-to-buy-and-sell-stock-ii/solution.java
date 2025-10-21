class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int max = 0;
        int sum = 0;
        for(int i = 1; i<prices.length; i++){
            mini = Math.min(mini,prices[i]);
            if(prices[i]<prices[i-1] && i!=prices.length-1){
                mini = prices[i];
                sum+=max;
                System.out.println(sum+" "+max);
                max = 0;
            }
            int profit = prices[i] - mini;
            max = Math.max(max, profit); 
        }
        if(sum!=0){
            return sum+max;
        }
        return max;
    }
}
