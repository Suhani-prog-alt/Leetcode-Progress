class Solution {
    public int numberOfSpecialChars(String word) {
        char [] cap = new char [26];
        char [] small = new char [26];
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                cap[word.charAt(i)-'A']++;
            }else{
                small[word.charAt(i)-'a']++;
            }
        }
        int ans = 0;
        for(int i = 0; i<26; i++){
            if(cap[i]>0 && small[i]>0)ans++;
        }
        return ans;
    }
}
