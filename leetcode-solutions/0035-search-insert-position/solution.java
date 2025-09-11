class Solution {
    public int searchInsert(int[] nums, int target) {
        return Search_insert_position(nums, target);
    }

    public static int Search_insert_position(int [] arr, int n) {
		int res = 0;
		for(int i = 0; i<arr.length; i++) {
			if(n<=arr[i]) {
				res = i;
                break;
			}
		}
        if(n>arr[arr.length-1]){
            res = arr.length;
        }
        if(n<arr[0]){
            res = 0;
        }
		return res;
		
	}

}
