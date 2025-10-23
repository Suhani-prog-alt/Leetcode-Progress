class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            int n = s.length();
            String S = "";
            for(int i = 0; i<n-1; i++){
                S = S + Integer.toString(((s.charAt(i)-'0') + (s.charAt(i+1)-'0'))%10);
            }
            s = S;
        }
        return s.charAt(0)==s.charAt(1);
    }
}
