class Solution {
    public int[][] sortMatrix(int[][] mat) {
        for(int i  = 1; i<mat[0].length; i++){
            sort(mat, 0, i, true);
        }
        for(int i = 0; i<mat.length; i++){
            sort(mat, i, 0, false);
        }
        return mat;
    }

    public static void sort(int [][] mat, int row, int col, boolean check){
        int r = row;
        int c = col;
        List<Integer> l = new ArrayList<>();
        while(r<mat.length && c<mat[0].length){
            l.add(mat[r][c]);
            r++;
            c++;
        }
        int idx = 0;
        r = row;
        c = col;
        Collections.sort(l);
        if(!check){
            Collections.reverse(l);
        }
        while(r<mat.length && c<mat[0].length){
            mat[r][c] = l.get(idx++);
            r++;
            c++;
        }
    }
}
