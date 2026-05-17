class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        // for up
        for(int i = 0; i<mat[0].length; i++){
            sort(mat, 0, i);
        }
        for(int i = 1; i<mat.length; i++){
            sort(mat, i, 0);
        }
        return mat;
    }

    public static void sort(int [][] mat, int row, int col){
        int r = row;
        int c = col;
        List<Integer> l =new ArrayList<>();
        while(r<mat.length && c<mat[0].length){
            l.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(l);
        int idx = 0;
        r = row;
        c = col;
        while(r<mat.length && c<mat[0].length){
            mat[r][c] = l.get(idx++);
            r++;
            c++;
        }
    }
}
