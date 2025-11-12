class Solution {
    public int findPeakElement(int[] nums) {
// 
        int lo  = 0, hi = nums.length-1, ans = nums.length -1;
		while(lo<hi) {
			int mid = (lo+hi)/2;
			if(nums[mid]> nums[mid+1]) {
				ans = mid;
				hi = mid;
			}else {
				lo = mid+1;
			}
		}
        return ans;


        // linear search
        // long max = Long.MIN_VALUE;
		// int pi = -1;
		// for(int i = 0; i<nums.length; i++) {
		// 	if(nums[i]>max) {
		// 		max = nums[i];
		// 		pi = i;
		// 	}
		// }
		// return pi;


        // int max = Integer.MIN_VALUE;
        // int idx = 0;
        // for(int i = 0; i<nums.length; i++){
        //     if(max<nums[i]) {
        //         idx = i;
        //         max = nums[i];
        //     }
        // }
        // return idx;
    }
}
