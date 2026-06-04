class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2<=100) return 0;
        int ans = 0;
        for(int i = num1; i<=num2; i++){
            if(!(i<=100))ans+=(wave(i));
        }
        return ans;
    }
    public static int wave(int n){
        String s = ""+n;
        int ans = 0;
        for(int i = 1; i<s.length()-1; i++){
            if( (s.charAt(i-1)>s.charAt(i)&& s.charAt(i+1)>s.charAt(i)) || (s.charAt(i-1)<s.charAt(i)&& s.charAt(i+1)<s.charAt(i)) )ans++;
        }
        return ans;
    }
}
