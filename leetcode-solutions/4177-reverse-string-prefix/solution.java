class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder S = new StringBuilder(s.substring(0,k));
        S.reverse();
        String res = s.substring(k);
        return S.toString()+res;
    }
}
