class Solution {
    public int numberOfSpecialChars(String word) {
        int [] count_cap = new int [26];
        int [] count_small = new int [26];
        int [] cap_idx = new int [26];
        int [] small_idx = new int [26];
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                if(count_cap[word.charAt(i)-'A']==0 ){
                    count_cap[word.charAt(i)-'A']++;
                    cap_idx[word.charAt(i)-'A'] = i;
                }
                
            }else{
                count_small[word.charAt(i)-'a']++;
                small_idx[word.charAt(i)-'a'] = i;
            }
        }

        int ans = 0;
        for(int i = 0; i<26; i++){
            if(small_idx[i]<cap_idx[i] && count_small[i]!=0 && count_cap[i]!=0)ans++;
        }
        // System.out.println(small_idx[0]+ " "+ cap_idx[0]);
        return ans;
    }
}
