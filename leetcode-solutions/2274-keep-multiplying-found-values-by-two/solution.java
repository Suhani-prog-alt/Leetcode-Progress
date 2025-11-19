class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(inIt(nums, original)){
            original*= 2;
        }
        return original;
    }

    public static boolean inIt(int [] arr, int k){
        for(int i = 0; i<arr.length; i++){
            if(k == arr[i]){
                return true;
            }
        }
        return false;
    }
}
