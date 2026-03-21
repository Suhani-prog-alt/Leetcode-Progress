class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int [][] res = new int [k][k];
        int m = 0;
        for(int i = x; i< x+k; i++){
            int n = 0;
            for(int j = y; j< y+k; j++){
                res[m][n] = grid[i][j];
                n++;
            }
            m++;
        }

        m--;
        for(int i = x; i< x+k; i++){
            int n = 0;
            for(int j = y; j< y+k; j++){
                grid[i][j] = res[m][n];
                n++;
            }
            m--;
        }

        return grid;


    }
}
