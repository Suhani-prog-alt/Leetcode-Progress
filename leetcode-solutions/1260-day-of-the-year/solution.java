class Solution {
    public int dayOfYear(String date) {
        String [] S = date.split("-");
        int [] Date = new int [3];
        for(int i = 0;  i<3; i++){
            Date[i] = Integer.parseInt(S[i]);
        }
        int sum = 0;
        if((Date[0]%4==0 &&  Date[0]%100!=0) || Date[0]%400==0){
            if(Date[1] == 1){

            }else if(Date[1]==2){
                sum+=31;
            }else if(Date[1]==3){
                sum+=60;
            }else if(Date[1]==4){
                sum+=91;
            }else if(Date[1]==5){
                sum+=121;
            }else if(Date[1]==6){
                sum+=152;
            }else if(Date[1]==7){
                sum+=182;
            }else if(Date[1]==8){
                sum+=213;
            }else if(Date[1]==9){
                sum+=244;
            }else if(Date[1]==10){
                sum+=274;
            }else if(Date[1]==11){
                sum+=305;
            }else if(Date[1]==12){
                sum+=335;
            }
        }
        else{
            if(Date[1] == 1){

            }else if(Date[1]==2){
                sum+=31;
            }else if(Date[1]==3){
                sum+=59;
            }else if(Date[1]==4){
                sum+=90;
            }else if(Date[1]==5){
                sum+=120;
            }else if(Date[1]==6){
                sum+=151;
            }else if(Date[1]==7){
                sum+=181;
            }else if(Date[1]==8){
                sum+=212;
            }else if(Date[1]==9){
                sum+=243;
            }else if(Date[1]==10){
                sum+=273;
            }else if(Date[1]==11){
                sum+=304;
            }else if(Date[1]==12){
                sum+=334;
            }
        }
        sum+=Date[2];
        return sum;
    }
}
