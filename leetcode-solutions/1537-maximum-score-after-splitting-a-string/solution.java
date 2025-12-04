class Solution {
    public int maxScore(String s) {
        String [] S = s.split("");
        int [] arr = new int [S.length];
        int t = 0;
        for(String ele : S){
            arr[t] = Integer.parseInt(ele);
            t++;
        }
        int [] left = new int [arr.length - 1];
        int [] right = new int [arr.length - 1];
        for(int i = 0; i<arr.length-1; i++){
            left[i] = arr[i];
            right[i] = arr[i+1];
        }

        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++){
            int count = 0;
            for(int j = 0; j<=i; j++){
                if(left[j]== 0) count++;
            }
            for(int j = i; j<arr.length-1; j++){
                if(right[j] == 1) count++;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}
