class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    boolean a = isOk(board, i, j);
                    if (a == false) return false;
                }
            }
        }
        return true;
    }
    public static boolean isOk(char [][] board, int row, int col){
        // row
        char a = board[row][col];
        for(int i = col+1; i<9; i++){
            if(board[row][i] == a) return false;
        }

        // col
        for(int i = row+1; i<9; i++){
            if(board[i][col] == a) return false;
        }
        int count = 0;
        int r = row - row%3;
        int c = col - col%3;
        for(int i = r; i<r+3; i++){
            for(int j = c; j<c+3; j++){
                if(board[i][j] == a){
                    count++;
                }
            }
        }
        if(count>1)return false;
        return true;
    }
}
