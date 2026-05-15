class Solution {
    public String removeOccurrences(String s, String part) {
        
        while(s.contains(part)){
            int idx = s.indexOf(part);
            String s1 = s.substring(0,idx);
            String s2 = s.substring(idx+part.length());
            s = s1+s2;

        }
        return s;
    }
}
