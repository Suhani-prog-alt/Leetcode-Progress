class Solution {
    public int maximumLength(int[] nums) {
        Map<Long, Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            mp.put((long)nums[i],mp.getOrDefault((long)nums[i],0)+1);
        }
        Map<Long, Integer> sortMp = new TreeMap<>(mp);
        int ans = Integer.MIN_VALUE;
        for(long i : sortMp.keySet()){
            int count = 0;
            long x = i;
            while(sortMp.containsKey(x) && sortMp.get(x)!=0){
                if(x == 1){count+=sortMp.get(x);}
                else if(sortMp.get(x)>=2){count+=2;}
                else if(sortMp.get(x)==1){
                    count+=1;
                    break;
                }
                sortMp.put(x,0);
                if(x>1000_000_000)break;
                x*=x;
            }
            ans = Math.max(ans, count);
        }
        return ans%2!=0? ans : ans-1;
    }
}
