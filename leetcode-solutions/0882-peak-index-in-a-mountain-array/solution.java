class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0;
        int hi = arr.length-1;
        int ans = 0;
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1]){
                ans = mid;
                hi = mid;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}
