/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        // long lo = 1;
		// long hi = n;
		// long ans = 0;
		// while(lo<=hi) {
		// long mid = (lo+hi)/2;
		// 	if (isBadVersion((int)mid) == true) {
		// 		ans = mid;
		// 		hi = mid -1;
		// 	}
		// 	else {
		// 		lo = mid+1;
		// 	}
		// }
		// return (int)ans;


        int lo = 1;
		int hi = n;
		int ans = 0;
		while(lo<=hi) {
		int mid = lo + (hi-lo)/2;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid -1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
    }

}
