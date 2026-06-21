class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int ans = 0;
        // if(((""+nums[n-1]).charAt(0)==(""+x).charAt(0) && nums[n-1]%10 == x)&& n == 1)return 1;
      
        
        for(int i = 0; i<n; i++){
            long sum = nums[i];
            if(((""+sum).charAt(0)==(""+x).charAt(0) && sum%10 == x)){
                    ans++;
                }
            for(int j = i+1; j<n; j++){
                sum+=nums[j];
                
                if(!((""+sum).charAt(0)==(""+x).charAt(0) && sum%10 == x)){
                    continue;
                }else{
                    ans++;
                }
                
            }
        }
        // if((""+nums[n-1]).charAt(0)==(""+x).charAt(0) && nums[n-1]%10 == x)ans++;
        return ans;
    }
}
