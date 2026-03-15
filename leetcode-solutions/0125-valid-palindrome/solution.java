class Solution {
    public boolean isPalindrome(String s) {
        String S = "";
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                S+=s.charAt(i);
            }
        }
        S = S.toLowerCase();
        int i = 0;
        int j = S.length()-1;
        while(i<=j){
            if(S.charAt(i)!=S.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
