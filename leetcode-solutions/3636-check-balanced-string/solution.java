class Solution {
    public boolean isBalanced(String num) {
        int even_su = 0;
        int odd_su = 0;
        for(int i = 0; i<num.length(); i++){
            if(i%2==0){
                even_su+=(num.charAt(i)-'0');
            }else{
                odd_su+=(num.charAt(i)-'0');
            }
        }
        return even_su==odd_su ? true : false;
    }
}
