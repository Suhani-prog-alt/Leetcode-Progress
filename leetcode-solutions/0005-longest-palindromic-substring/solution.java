class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String S = s.substring(i, j);
                if( ans.length()<S.length() && IsPalindrome(S)){
                    ans = S;
                }
            }
        }
        return ans;
    }

    public static boolean IsPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
