class Solution {
    public boolean canBeEqual(String s1, String s2) {
        boolean check = true;
        char [] S1 = s1.toCharArray();
        char [] S2 = s2.toCharArray();
        for(int i = 0; i<S1.length-2; i++){
            if(S1[i] != S2[i]){
                char s = S1[i];
                S1[i] = S1[i+2];
                S1[i+2] = s;
            }
        }

        for(int i = 0; i<S1.length; i++){
            if(S1[i] != S2[i]) return false;
        }
        return check;
    }
}
