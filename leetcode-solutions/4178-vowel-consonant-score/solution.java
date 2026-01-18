class Solution {
    public int vowelConsonantScore(String s) {
        int cons = 0;
        int v = 0;
        for(int i = 0; i<s.length(); i++){
           if( s.charAt(i) == 'a' ||  s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'o' ){
               v++;
           }else if (s.charAt(i) >= 'a' && s.charAt(i)<= 'z' ){
               cons++;
           }
        }
        if(cons>0){
            return  (int)Math.floor(v/cons);
        }else{
            return 0;
        }
    }
}
