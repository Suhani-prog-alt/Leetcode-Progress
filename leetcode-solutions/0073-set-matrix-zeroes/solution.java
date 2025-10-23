class Solution {
    public void setZeroes(int[][] matrix) {
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    count++;
                    for(int k = 0; k<matrix.length; k++){
                        if(matrix[k][j]==0){
                            matrix[k][j]=0;
                        }
                        else matrix[k][j] = -10;
                    }
                    for(int k = 0; k<matrix[i].length; k++){
                        if(matrix[i][k]==0){
                            matrix[i][k]=0;
                        }
                        else matrix[i][k] = -10;
                    }
                }
            }
        }
        if(count>0){
            for(int i = 0; i<matrix.length; i++){
                for(int j = 0; j<matrix[i].length; j++){
                    if(matrix[i][j] == -10){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
