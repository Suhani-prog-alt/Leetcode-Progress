class Solution {
    public String getHappyString(int n, int k) {
        idx = 1;
        if(n == 0) return "";
        String [] arr = new String [105];
        // Arrays.fill(arr, "");
        print(n, "", arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return arr[k] == null ? "" : arr[k];
    }
    static int idx;

    public static void print(int n, String ans, String [] arr){
        if(ans.length() == n){
            if(idx<arr.length){
                arr[idx] = ans;
            }
            idx++;
            return;
        }
        if(ans.equals("") || ans.charAt(ans.length()-1)!='a'){
            print(n, ans+'a', arr);
        }
        if(ans.equals("") || ans.charAt(ans.length()-1)!='b'){
            print(n, ans+'b', arr);
        }
        if(ans.equals("") || ans.charAt(ans.length()-1)!='c'){
            print(n, ans+'c', arr);
        }
    }
}
