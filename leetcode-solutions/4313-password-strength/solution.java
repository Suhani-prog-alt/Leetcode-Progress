class Solution {
    public int passwordStrength(String password) {
        Set<Character> st = new HashSet<>();

        for(char ch : password.toCharArray()){
            st.add(ch);
        }
        String s = "";
        for(char c : st){
            s+=c;
        }
        int ans = 0;
        for(int i= 0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans+=1;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans+=2;
            }else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+=3;
            }else{
                ans+=5;
            }
        }
        return ans;
    }
}
