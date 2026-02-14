class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char [] ch = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        String S = "";
        for(int i = 0; i<words.length; i++){
            int s = 0;
            for(int j = 0; j<words[i].length(); j++){
                s+= weights[(words[i].charAt(j)- 'a')];
            }
            S+= ch[s%26];
        }
        return S;
    }
}
