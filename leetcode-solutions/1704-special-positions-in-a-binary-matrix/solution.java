class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    if(column(mat, j) && row(mat, i)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static boolean column(int [][] arr, int j){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i][j] == 1){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
    public static boolean row(int [][] arr, int i){
        int count = 0;
        for(int j = 0; j< arr[i].length; j++){
            if(arr[i][j] == 1){
                count++;
            }
        }
        if(count == 1){
            return true;
        }
        return false;
    }
}
