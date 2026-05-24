class Solution {
    public String trimTrailingVowels(String s) {
        // String s = S;
        // int front = 0;
        // for(int i = 0; i<s.length(); i++){
        //     if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
        //         s = s.substring(1);
        //         i = -1;
        //         front++;
        //     }else{
        //         break;
        //     }
        // }
        // int back= 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                s = s.substring(0,s.length()-1);
                i = s.length();
                // back++;
            }else{
                break;
            }
        }
        // if(front>back){
        //     S = S.substring(front);
        // }else{
        //     S = S.substring(0,S.length()-back);
        // }
        return s;
    }
}
