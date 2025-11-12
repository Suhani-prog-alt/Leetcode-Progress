class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        return findDiagonal(mat);

    }
    public  int [] findDiagonal(int [][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int [] ans = new int[row*col];
		int idx = 0;
		for(int d= 0; d<row+col-1; d++) {
			int r,c;
			if(d<col) {
				r = 0;
				c = d;
			}else {
				r = d-col+1;
				c = col-1;
			}
			ArrayList<Integer> ll = new ArrayList<Integer>();
			while(r<arr.length && c>=0) {
				// arr[r][c] --> add or paint
				ll.add(arr[r][c]);
				r++;
				c--;
			}
			if(d%2!=0) {
				for(int ele : ll) {
					ans[idx] = ele;
					idx++;
				}
			}
			else {
				Collections.reverse(ll);
				for(int ele : ll) {
					ans[idx] = ele;
					idx++;
				}
			}
		}
		return ans;
	}
}
