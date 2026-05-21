class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int [] arr = new int [n];
        // for rows
        int inti = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j  =0; j<n; j++){
                if(arr[matrix[i][j]-1]==inti){
                    arr[matrix[i][j]-1]++;
                }else{
                    return false;
                }
            }
            inti++;
        }

        for(int i = 0; i<matrix.length; i++){
            for(int j  =0; j<n; j++){
                if(arr[matrix[j][i]-1]==inti){
                    arr[matrix[j][i]-1]++;
                }else{
                    return false;
                }
            }
            inti++;
        }
        return true;
    }

    
}
