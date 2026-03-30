class Solution {
    public boolean checkStrings(String s1, String s2) {
        int [] even = new int [26];
        int [] odd = new int [26];
        for(int i = 0; i<s1.length(); i++){
            if(i%2 ==0){
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']--;
            }else{
                odd[s1.charAt(i)-'a']++;
                odd[s2.charAt(i)-'a']--;
            }
        }

        for(int i = 0; i<26; i++){
            if(even[i] !=0 || odd[i]!=0) return false;
        }

        return true;

        // char [] S1 = s1.toCharArray();
        // char [] S2 = s2.toCharArray();

        // for(int i = 0; i<S1.length; i++){
        //     if(S1[i]!=S2[i]){
        //         for(int j = i+2; j<S2.length; j+=2){
        //             if(S1[j] == S2[i]){
        //                 char c = S1[i];
        //                 S1[i] = S1[j];
        //                 S1[j] = c;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // for(int i = 0; i<S1.length; i++){
        //     if(S1[i]!=S2[i]) return false;
        // }
        // return true;
    }
    
}
