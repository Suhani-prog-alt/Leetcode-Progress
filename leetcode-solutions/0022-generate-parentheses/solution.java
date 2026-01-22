class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        Parentheses(n, 0, 0, "", arr);
        return arr;
    }

    public static void Parentheses(int n, int open, int closed, String ans, List<String> arr) {
		
		if(open == n && closed == n) {
			// System.out.println(ans);
            arr.add(ans);
			return;
		}
		
		if(open > n || closed > open) {
			return;
		}
		
		Parentheses(n, open+1, closed, ans + '(', arr);
		Parentheses(n, open, closed+1, ans + ')', arr);
	}
}
