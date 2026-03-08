class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n  =  nums[0].length();
        return find(nums, n, "");
    }
    public static String find(String [] nums, int n, String ans){
        if(ans.length() == n){
            if(!check(nums, ans)){
                return ans;
            }
            return "";
        }

        String s1 = find( nums, n, ans + "0");
        if(!s1.equals("")) return s1;
        String s2 = find(nums, n, ans + "1");
        return s2;
    }

    public static boolean check(String [] nums, String ans){
        for(String ele : nums){
            if(ans.equals(ele)){
                return true;
            }
        }
        return false;
    }
}
