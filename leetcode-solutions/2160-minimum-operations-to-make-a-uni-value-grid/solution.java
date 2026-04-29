class Solution {
    public int minOperations(int[][] grid, int x) {
        int [] arr = new int [grid.length * grid[0].length];
        int k = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                arr[k++] = grid[i][j];
            }
        }

        int [] s = Sort(arr, 0, arr.length-1);
        int med = s[s.length/2];
        int op = 0;
        for(int i = 0; i<s.length; i++){
            if((s[i]-med)%x == 0){
                op+=(Math.abs(s[i]-med)/x);
            }else{
                return -1;
            }
        }
        return op;
    }

    public static int [] Sort(int [] arr, int si, int ei){
        if(si == ei){
            int [] bs = new int [1];
            bs[0] = arr[si];
            return bs;
        }

        int mid = (si+ei )/2;

        int [] A = Sort(arr, si, mid);
        int [] B = Sort(arr, mid+1, ei);
        return Merge(A,B);
    }

    public static int [] Merge(int [] A, int [] B){
        int [] arr = new int [A.length+B.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        while(i<A.length && j< B.length){
            if(A[i]<B[j]){
                arr[k] = A[i];
                i++;
                k++;
            }else{
                arr[k] = B[j];
                j++;
                k++;
            }
        }
        while(i<A.length){
            arr[k] = A[i];
            i++;
            k++;
        }
        while(j<B.length){
            arr[k] = B[j];
            j++;
            k++;
        }
        return arr;
    }
}
