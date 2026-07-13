class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=9; i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int n = q.poll();
            if(n>= low && n<=high){
                ans.add(n);
            }
            int lstdigit = n%10;
            if(lstdigit!=9){
                int nextNum = (n*10)+(lstdigit+1);

                if(nextNum<=high){
                    q.offer(nextNum);
                }
            }
        }
        return ans;
    }
}
