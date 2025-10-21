class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int start_row = 0, start_col = 0;
        int end_row = n-1, end_col = n-1;
        int num = 1;
        while(end_row>=start_row && end_col>=start_col){
            // first row
            for(int i = start_col; i<=end_col; i++){
                arr[start_row][i] = num;
                num++;
            }
            start_row++;

            //last col
            for(int i = start_row; i<=end_row; i++){
                arr[i][end_col] = num;
                num++;
            }
            end_col--;

            //last row
            if(end_row>=start_row){
                for(int i = end_col; i>=start_col; i--){
                    arr[end_row][i] = num;
                    num++;
                }
            }
            end_row--;

            //first col
            if(end_col>=start_col){
                for(int i = end_row; i>=start_row; i--){
                    arr[i][start_col] = num;
                    num++;
                }
            }
            start_col++;
        }
        return arr;
    }
}
