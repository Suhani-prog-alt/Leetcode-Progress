class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean [] isVisited = new boolean [arr.length];
        return check(arr, start, isVisited);
    }

    public static boolean check(int [] arr, int idx, boolean [] isVisited){
        if(idx<0 || idx>=arr.length || isVisited[idx]) return false;
        if(arr[idx] == 0) return true;  
        isVisited[idx] = true;
        boolean a = check(arr, idx+arr[idx], isVisited);
        if(a == false){
            isVisited[idx] = false;
        }
        isVisited[idx] = true;
        boolean b = check(arr, idx-arr[idx], isVisited);
        if(b == false){
            isVisited[idx] = false;
        }
        if(a||b)return true;
        return false;
    }
}
