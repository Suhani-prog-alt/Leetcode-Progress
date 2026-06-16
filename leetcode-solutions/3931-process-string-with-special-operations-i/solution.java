class Solution {
    public String processStr(String s) {
        String result = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '*' && result.length()>=1){
                result = result.substring(0,result.length()-1);
            }
            else if (s.charAt(i) == '#'){
                result+=result;

            }else if( s.charAt(i) == '%'){
                String S = result;
                result = "";
                for(int j = S.length()-1; j>=0; j--){
                    result+=S.charAt(j);
                }
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                result+=s.charAt(i);
            }
        }
        return result;
    }
}
