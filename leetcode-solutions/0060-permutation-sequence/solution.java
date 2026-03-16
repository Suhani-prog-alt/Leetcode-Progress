class Solution {
    public String getPermutation(int n, int k) {
        idx = 1;
        String [] arr = new String [k+1];
        boolean [] check = new boolean [n+1];
        get(arr, n, "", check);
        
        return arr[k];
        
    }

    static int idx;

    public static void get(String [] arr, int n, String ans, boolean []check){
        if(ans.length() == n){
            if(idx<arr.length){
                arr[idx] = ans;
            }  
            idx++;
            return;
        }

        for(int i = 1; i<=n; i++){
            if(check[i] == false){
                check[i] = true;
                get(arr, n, ans+i, check);
                check[i] = false;
            }
        }
    }
}
