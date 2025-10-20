class Solution {
    public String convertToBase7(int num) {
        int sum = 0;
        int mul = 1;
        // num = Math.abs
        while(num!=0){
            int rem = num%7;
            sum+=rem*mul;
            mul*=10;
            num/=7;
        }
        return String.valueOf(sum);
    }
}
