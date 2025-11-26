class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ll = new  ArrayList<Integer>();
        int count = 0;
        for(int i = arr.length; i>0; i--){
            int max_idx = WhatMax(arr, i-1);
            ll.add(max_idx);
            Flip(arr, max_idx-1);
            ll.add(i);
            Flip(arr, i-1); 
        }
        return ll;
    }

    public static void Flip(int [] arr, int k){
        int i = 0; 
        int j = k;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static int WhatMax(int [] arr, int k){
        int max_idx = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=k; i++){
            if(max<arr[i]){
                max = arr[i];
                max_idx = i+1;
            }
        }
        return max_idx;
    }
}
