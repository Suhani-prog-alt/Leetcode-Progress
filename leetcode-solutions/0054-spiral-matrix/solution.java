class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;
        while(end_col >= start_col && end_row >= start_col){
            // for first row
            for(int i = start_col; i<=end_col; i++){
                list.add(matrix[start_row][i]);
            }
            start_row++;

            // for last column
            for(int i = start_row; i<=end_row; i++){
                list.add(matrix[i][end_col]);
            }
            end_col--;

            //last row
            if(end_row>=start_row){
                for(int i = end_col; i>=start_col; i--){
                    list.add(matrix[end_row][i]);
                }
                end_row--;
            }
            // first col
            if(end_col>=start_col){
                for(int i = end_row; i>=start_row; i--){
                    list.add(matrix[i][start_col]);
                }
                start_col++;
            }
        }
        return list;
    }
}
