class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        check(n, "", 0, 0, l);
        return l;
    }
    public void check(int n, String s, int left, int right, List<String> l){
        if(n == left && n == right){
            l.add(s);
            return;
        }

        if(left>n || right > n)return;
        check(n, s+"(", left+1, right, l);
        if(left>right){
            check(n, s+")", left, 1+right, l);
        }
    }
}
