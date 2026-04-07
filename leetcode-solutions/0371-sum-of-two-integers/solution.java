class Solution {
    public int getSum(int a, int b) {
        int xor = a^b;
        int carry = a&b;
        while(carry!=0){
            carry<<=1;
            a = xor;
            b = carry;
            xor = a^b;
            carry = a&b;
        }
        return xor;
    }
}
