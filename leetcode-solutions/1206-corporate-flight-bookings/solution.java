class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] arr = new int [n];
        for(int i = 0; i<bookings.length; i++){
            int a = bookings[i][0];
            int b = bookings[i][1];
            while(a<=b){
                arr[a-1] += bookings[i][2];
                a++;
            }
        }
        return arr;
    }
}
