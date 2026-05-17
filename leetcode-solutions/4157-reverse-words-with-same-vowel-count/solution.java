class Solution {
    public String reverseWords(String s) {
        String [] S = s.split(" ");
        int c = count(S[0]);
        for(int i = 1; i<S.length; i++){
            int count_vowel = count(S[i]);
            if(c == count(S[i])){
                S[i] = reverse(S[i]);
            }
        }
        String ans = "";
        for(int i = 0; i<S.length-1; i++){
            ans+=(S[i]+" ");
        }
        ans+=S[S.length-1];
        return ans;
    }

    public static String reverse(String s){
        String ans = "";
        for(int i = s.length()-1; i>=0; i--){
            ans+=s.charAt(i);
        }
        return ans;
    }

    public static int count(String s){
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ){
                ans++;
            }
        }
        return ans;
    }
}
