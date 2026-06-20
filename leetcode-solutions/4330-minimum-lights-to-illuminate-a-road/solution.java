class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;

        int [] maxR = new int[lights.length];
        Arrays.fill(maxR, -1);

        for(int i = 0; i<n; i++){
            if(lights[i]>0){
                int left = Math.max(0, i-lights[i]);
                int right = Math.min(n-1, i+lights[i]);
                maxR[left] = Math.max(maxR[left], right);
            }
        }
        int ans = 0;
        int curE = -1;
        int far = -1;
        for(int i = 0; i<n; ){
            while(curE+1<=i){
                curE++;
                if(curE<n){
                    far = Math.max(far, maxR[curE]);
                }
            }

            if(far >= i){
                i = far+1;
            }else{
                ans++;
                i+=3;
            }
        }
        return ans;
    }
}
