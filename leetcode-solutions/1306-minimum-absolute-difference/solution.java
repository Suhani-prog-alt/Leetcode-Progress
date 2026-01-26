class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int mini_ = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            mini_ = Math.min(mini_, Math.abs(arr[i]-arr[i+1]));
        }

        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            List<Integer>  a = new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==mini_){
                a.add(arr[i]);
                a.add(arr[i+1]);
            }
            if(a.size()!=0) l.add(a);
        }
        return l;
    }
}
