class Solution {
    public int minOperations(String s) {
        int c1 = alter(s, '0', '1', s.length());
        int c2 = alter(s, '1', '0', s.length());
        return Math.min(c1, c2);
        
    }
    public static int alter(String s, char a, char b, int len){
        for(int i = 0; i<s.length();){
            if(i<s.length() && s.charAt(i) == a){
                i++;
                len--;
            }else{
                i++;
            }
            if(i<s.length() && s.charAt(i) == b){
                i++;
                len--;
            }else{
                i++;
            }
        }
        return len;
    }
}
