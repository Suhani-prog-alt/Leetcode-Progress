class Solution {
    public int[] replaceElements(int[] arr) {
        int [] arr2 = new int [arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = IsBig(arr,i+1);
        }
        return arr2;
    }

    public static int IsBig(int [] arr, int k){
        int ans = -1;
        for(int i = k; i<arr.length; i++){
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }
}
