class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i<image.length; i++){
            int k = image.length-1;
            for(int j = 0; j<image.length/2; j++){
                int temp  = image[i][k];
                image[i][k] = image[i][j];
                image[i][j] = temp;
                k--;
            }
        }

        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image.length; j++){
                if(image[i][j]==1){
                    image[i][j] = 0;
                }
                else if(image[i][j]==0){
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
