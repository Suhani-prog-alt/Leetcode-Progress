class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> l = new ArrayList<>();
        Part(s, ll, l);
        return l;
    }

    public static void Part(String s, List<String> ll, List<List<String>>  l){
        if(0 == s.length()){
            l.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 1; i<=s.length(); i++){
            String s1 = s.substring(i);
            String s2 = s.substring(0, i);
            if(isPalindrome(s2)){
                ll.add(s2);
                Part(s1,ll, l);
                ll.remove(ll.size()-1);
            }
            
        }
        return;
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
