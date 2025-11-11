class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String [] S = s.split(" +");
        // System.out.print(S[S.length-1]);
        return S[S.length-1].length();
    }
}
