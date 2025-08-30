class Solution {
    public boolean isMonotonic(int[] nums) {
        
        return IS_monotoic(nums);

    }

    public static boolean IS_monotoic(int [] arr) {
		int l = arr.length;
		int asc = 0;
		int des = 0;
		for(int i = 0; i<l-1; i++) {
			if(arr[i]<=arr[i+1] && i<=i+1) {
				asc++;
				
			}
			if (arr[i]>=arr[i+1] && i<=i+1) {
				des++;
			}
		}
		// System.out.println(asc);
		// System.out.println(des);
		if(asc == l-1 || des == l-1) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
