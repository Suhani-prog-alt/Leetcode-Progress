class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        Lexicographical(0, n, l);
        return l;
        
    }
    public static void Lexicographical(int curr, int n, List<Integer> l) {
		if(curr > n) {
			return;
		}
		// System.out.println(curr);
        if(curr!= 0){
            l.add(curr);
        }
		int i = 0; 
		if(curr == 0) {
			i = 1;
		}
		for(; i<= 9; i++) {
			Lexicographical(curr*10 +i, n,l);
		}
	}
}
