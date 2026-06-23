class Solution {
    public int maxNumberOfBalloons(String text) {
        int [] arr = new int [5];
        for(int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            if(c == 'b')arr[0]++;
            else if(c == 'a')arr[1]++;
            else if(c == 'l')arr[2]++;
            else if(c == 'o')arr[3]++;
            else if(c == 'n')arr[4]++;
        }
        int min = 0;
        for(int i =0; i<5; i++){
            min = Math.min(arr[i],min);
        }
        int i = 0;
        int ans = 0;
        while(arr[i]>0){
            if(i == 2 || i == 3){
                arr[i]-=2;
            }else{
                arr[i]--;
            }
            if(arr[i]<0){
                    break;
            }
            i++;
            if(i == 5){
                ans++;
                i = 0;
            }
        }
        return Math.max(min, ans);
    }
}
