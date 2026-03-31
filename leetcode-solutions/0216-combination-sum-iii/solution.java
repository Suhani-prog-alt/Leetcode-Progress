class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        int [] arr = new int [9];
        for(int i = 0; i<9; i++){
            arr[i] = i+1;
        }
        combi(l, ll, n, k, 0, arr, 0);
        return l;

    }

    public static void combi(List<List<Integer>> l, List<Integer> ll, int target, int k, int sum, int [] arr, int idx){
        if(k == 0 && sum == target){
            l.add(new ArrayList<>(ll));
            return;
        }
        for(int i = idx; i<arr.length; i++){
            if((target-sum) >= arr[i]){
                ll.add(arr[i]);
                combi(l, ll, target, k-1, sum+arr[i], arr, i+1);
                ll.remove(ll.size()-1);
            }
        }
        return;
    }
}
