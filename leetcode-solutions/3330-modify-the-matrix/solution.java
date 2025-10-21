class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = max(matrix,j);
                }
            }
        }
        return matrix;
    }

    public static int max(int[][] matrix, int j){
        int Max = matrix[0][j];
        for(int i = 0; i<matrix.length; i++){
            Max = Math.max(matrix[i][j],Max);
        }
        return Max;
    }
}
