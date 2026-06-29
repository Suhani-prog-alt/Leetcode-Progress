class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if(n==1 || n==7)return true;
        if(n<10)return false;
        
            while(n>0){
                int rem = n%10;
                sum+=(rem*rem);
                n/=10;
                if(n==0){
                    n = sum;
                    sum = 0;
                    if(n==1 || n==7)return true;
                    if(n<10)return false;
                }
            }
            
        return n==1;
    }
}
