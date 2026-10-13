class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(check(board, word, i, j, 0))return true;
            }
        }
        return false;
    }

    public boolean check(char [][] board, String word, int i, int j, int idx){
        if(word.length() == idx)return true;
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || word.charAt(idx)!=board[i][j]) return false;
        char c = board[i][j];
        board[i][j] = '.';
        if(check(board, word, i-1, j, idx+1))return true;
        if(check(board, word, i+1, j, idx+1))return true;
        if(check(board, word, i, j-1, idx+1))return true;
        if(check(board, word, i, j+1, idx+1))return true;

        board[i][j] = c;
        return false;
    }
}
