class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        for(int i = 0; i<=s2.length()-len; i++){
            char [] arr1 = s1.toCharArray();
            char [] arr2 = s2.substring(i, len+i).toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)) return true;
        }
        return false;
    }
}
