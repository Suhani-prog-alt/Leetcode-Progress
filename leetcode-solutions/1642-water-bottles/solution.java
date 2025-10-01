class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(true){
            int drinkable = numBottles/numExchange;
            int nonDrinkable = numBottles%numExchange;
            sum += drinkable;
            numBottles = drinkable+nonDrinkable;
            if(numBottles<numExchange){
                break;
            }
        }
        return sum;
    }
}
