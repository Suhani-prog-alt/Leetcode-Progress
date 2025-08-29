class Solution {
    public int[] twoSum(int[] nums, int target) {
        return two_sum(nums, target);

    }

    public static int [] two_sum(int [] arr, int n){
		int len = arr.length;
		int [] a = new int [2];
		for (int i = 0; i<len; i++) {
			for (int j = i+1; j<len; j++) {
				if(arr[i]+arr[j]==n) {
					a[0] = i;
					a[1] = j;
					
				}
			}
		}
		return a;
	}
}
