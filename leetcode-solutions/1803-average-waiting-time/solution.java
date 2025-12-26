class Solution {
    public double averageWaitingTime(int[][] customers) {
        int arriving_time = 0;
        double sum = 0;
        for(int i = 0; i<customers.length; i++){
            arriving_time = Math.max(arriving_time, customers[i][0]);
            int total_time = arriving_time + customers[i][1];
            int waiting_time = total_time - customers[i][0];
            sum+=waiting_time;
            arriving_time = total_time;

        }
        return sum/customers.length;
    }
}
