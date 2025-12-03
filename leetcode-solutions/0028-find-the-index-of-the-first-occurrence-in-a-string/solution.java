class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i<haystack.length(); i++){
            int count = 0;
            int k = i;
            for(int j = 0; j<needle.length() && k<haystack.length(); j++){
                if(haystack.charAt(k) == (needle.charAt(j))){
                    count++;
                    k++;
                }
                else{
                    // i-=count;
                    break;
                }
            }
            if(count == needle.length()){ return i;}
        }
        return -1;
    }
}
