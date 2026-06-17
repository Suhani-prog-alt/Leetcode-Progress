class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long l = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '*'){
                if(l>0)l--;
            }else if(s.charAt(i) == '#'){
                l*=2;
            }else if (s.charAt(i) == '%'){
                continue;
            }else{
                l++;
            }
        }
        if(k>=l)return '.';
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == '*'){
                l++;
            }else if(s.charAt(i) == '#'){
                l/=2;
                k = k>=l ? k - l : k;
            }else if (s.charAt(i) == '%'){
                k = l-k-1;
            }else{
                l--;
            }
            if(k == l){
                return s.charAt(i);
            }
        }
        return '.';
    }
}
