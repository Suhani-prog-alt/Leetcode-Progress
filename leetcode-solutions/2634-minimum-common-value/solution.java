class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = -1;
        boolean check = false;
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    ans = nums1[i];
                    check = true;
                    break;
                }
                if(nums1[i]<nums2[j]){
                    break;
                }
            }
            if(check){
                break;
            }
        }
        return ans;
    }
}
