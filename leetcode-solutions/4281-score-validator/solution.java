class Solution {
    public int[] scoreValidator(String[] events) {
        int [] ans = new int [2];
        int score = 0;
        int counter = 0;
        for(int i = 0; i<events.length; i++){
            if(counter == 10) break;
            if(events[i].equals("1")) {
                score+=1;
            }else if(events[i].equals("2")){
                score+=2;
            }else if(events[i].equals("3")){
                score+=3;
            }else if(events[i].equals("4")){
                score+=4;
            }else if(events[i].equals("6")){
                score+=6;
            }else if(events[i].equals("W")){
                counter++;
            }else if(events[i].equals("0")){
                
            }else{
                score++;
            }
        }
        ans[0] = score;
        ans[1] = counter;
        return ans;
    }
}
