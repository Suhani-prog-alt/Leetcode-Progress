class Solution {
    public String[] createGrid(int m, int n) {
        String [] s = new String [m];
        s[0] = ".";
        for(int i = 0; i<n-1; i++){
            s[0]+='.';
        }
        if(n == 1){
            for(int i = 0; i<m; i++){
                s[i] = ".";
            }
            return s;
        }
        for(int i = 1; i<m; i++){
            s[i] = "#";
            for(int j = 0; j<n-2; j++){
                s[i]+='#';
            }
            s[i]+='.';
        }
        return s;
    }
}
