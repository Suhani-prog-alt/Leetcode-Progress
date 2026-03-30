class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] S = new int [26];
        int [] T = new int [26];
        for(int i = 0; i<s.length(); i++){
            S[s.charAt(i)-'a'] = i;
        }
        for(int i = 0; i<t.length(); i++){
            T[t.charAt(i)-'a'] = i;
        }
        int sum = 0;
        for(int i = 0; i<26; i++){
            sum+= Math.abs(S[i]-T[i]);
        }
        return sum;
    }
}
