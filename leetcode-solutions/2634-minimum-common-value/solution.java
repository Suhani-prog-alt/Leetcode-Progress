class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i =0, j = 0;
        while(i!=m && j!=n){
            if(nums1[i]==nums2[j]) return nums1[i];
            if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        while(i!=m){
            if(nums1[i]==nums2[j-1]) return nums1[i];
            i++;
        }
        while(j!=n){
            if(nums1[i-1]==nums2[j]) return nums2[j];
            j++;
        }
        return -1;
    }
}
