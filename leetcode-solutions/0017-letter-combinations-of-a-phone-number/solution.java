class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> l = new ArrayList<>();
        KeyPaid(digits, "",l);
        return l;
    }

    public static void KeyPaid(String ques, String ans, List<String> l) {
		if(ques.length() == 0) {
			l.add(ans);
			return;
		}
		
		char ch = ques.charAt(0);  
		String get = key[ch - '0'];
		for(int i = 0; i< get.length(); i++) {
			KeyPaid(ques.substring(1), ans+get.charAt(i), l);
		}
	}
}
