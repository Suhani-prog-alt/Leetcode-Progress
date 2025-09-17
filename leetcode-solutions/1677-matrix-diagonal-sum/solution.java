class Solution {
    public int diagonalSum(int[][] mat) {
        return Diagonal(mat);
    }

    public static int Diagonal(int [][] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i==j){
                    sum+= arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                else if(i+j+1 == arr.length){
                    sum+= arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                
            }
            System.out.println();
        }

        return sum;

        // for(int i = arr.length; i>0; i--){
        //     for(int j = arr[i].length; j>0; j--){
        //         if(i==j){
        //             sum+= arr[i][j];   
        //         }
        //     }
        // }
    }
}
