class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        for(int i=0; i<=s.length()-2;i++){
            int a= s.substring(i).indexOf('a');
            int b= s.substring(i).indexOf('b');
            int c= s.substring(i).indexOf('c');
            if(a!=-1 && b!=-1 && c!=-1)count+=(s.substring(i).length()-Math.max(a,Math.max(b,c)));
        }
        return count;
    }
}
