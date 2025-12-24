class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder S = new StringBuilder(num);
        S.reverse();
        String s = S.toString();
        int i = 0;
        while(S.charAt(i)=='0'){
            i++;
        }
        String s1 = s.substring(i, s.length());
        StringBuilder s2 = new StringBuilder(s1);
        return s2.reverse().toString();
    }
}
