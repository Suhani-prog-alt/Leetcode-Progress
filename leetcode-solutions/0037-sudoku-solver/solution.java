class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static boolean solve(char [][] board, int cr, int cc){
        if(cc == 9){
            cc = 0;
            cr++;
        }
        if(cr == 9){
            return true;
        }

        if(board[cr][cc] != '.'){
            return solve(board, cr, cc+1);
        }
        else{
            for(int i = 1; i<=9; i++){    
                if(IsSafe(board, cr, cc, (char) (i+'0'))){
                    board[cr][cc] = (char)(i+'0');
                    boolean ans = solve(board, cr, cc+1);
                    if(ans) return true;
                    board[cr][cc] = '.';

                }
            }
        }

        return false;
    }

    public static boolean IsSafe(char [][] board, int cr, int cc, char val){
        int r = cr;
        int c = cc;
        //vertically
        for(int i = 0; i< 9; i++){
            if(board[i][c] == val) return false;
        }

        //Horizontally
        for(int i = 0; i< 9; i++){
            if(board[r][i] == val) return false;
        }

        r = cr - cr%3;
        c = cc - cc%3;
        for(int i = r; i<r+3; i++){
            for(int j = c; j<c+3; j++){
                if(board[i][j] == val) return false;
            }
        }
        return true;
    }
}
