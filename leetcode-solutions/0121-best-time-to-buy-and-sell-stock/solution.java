class Solution {
    public int maxProfit(int[] prices) {
        return Best_Time(prices);
    }

    public static int Best_Time(int [] prices){
        int mini = 10000;
        int max_prices = 0;
        int price;
        for(int i = 0; i<prices.length; i++){
            mini = Math.min(mini, prices[i]);
            price = prices[i] - mini;
            max_prices = Math.max(max_prices, price);
        }
        return max_prices;
    }

}
