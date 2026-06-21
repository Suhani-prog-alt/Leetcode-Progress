class Solution {
    public int maxDistance(String moves) {
        int ans = 0;
        int x = 0;
        int y = 0;
        int k = 0;
        for(int i =0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L')x--;
            if(moves.charAt(i) == 'R')x++;
            if(moves.charAt(i) == 'U')y--;
            if(moves.charAt(i) == 'D')y++;
            if(moves.charAt(i) == '_')k++;
        }
        return Math.abs(x)+Math.abs(y)+k;
    }

}
