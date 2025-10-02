class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        numBottles = 0;
        int emptyBottles = total;
        while(emptyBottles>=numExchange || numBottles!=0){
            while(emptyBottles>=numExchange){
                emptyBottles-=numExchange;
                numBottles++;
                numExchange++;
            }
            total+=numBottles;
            emptyBottles+=numBottles;
            if(numBottles<numExchange && emptyBottles==0){
                total+=numBottles;
            }
            else{
                numBottles = 0;
            }
        }
        // System.out.println(emptyBottles);
        // System.out.println(numBottles);
        // System.out.println(numExchange);
        return total;
    }
}
