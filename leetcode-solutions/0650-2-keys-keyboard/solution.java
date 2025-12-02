class Solution {
    public int minSteps(int n) {
        List<Integer> factor = new ArrayList<>();
        int i = 2;
        while(n>0 && i<=n){
            if(n%i==0){
                factor.add(i);
                n/=i;
                i--;
            }
            i++;
        }
        int sum = 0;
        for(int ele:factor){
            sum+=ele;
        }
        return sum;
    }
}
