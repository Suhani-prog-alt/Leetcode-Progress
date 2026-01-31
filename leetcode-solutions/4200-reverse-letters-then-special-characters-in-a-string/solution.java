class Solution {
    public String reverseByType(String s) {
        List<Character> c = new ArrayList<>();
        List<Character> sp = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>= 'a' && s.charAt(i) <= 'z'){
                c.add(s.charAt(i));
            }else{
                sp.add(s.charAt(i));
            }
        }

        Collections.reverse(c);
        Collections.reverse(sp);

        String S = "";
        int j = 0;
        int k = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>= 'a' && s.charAt(i) <= 'z'){
                S+=c.get(j);
                j++;
            }else{
                S+=sp.get(k);
                k++;
            }
        }
        return S; 
    }
}
