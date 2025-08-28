class Solution {
    public void rotate(int[] nums, int k) {
        Rotate(nums,k);
    }

    // public static void Rotate(int [] arr, int k) {
	// 	int n = arr.length;
	// 	k = k%n;
	// 	for(int j = 1; j<=k; j++) {
	// 		int item = arr[n-1];
	// 		for (int i = n-2; i>=0; i--) {
	// 			arr[i+1] = arr[i];
	// 		}
	// 		arr[0] = item;
	// 	}
		
	// }

    public static void Rotate(int [] arr, int k) {
		int n = arr.length;
		k = k%n;
		// starting k n-k element reverse [0, n-k-1]
		Reverse(arr,0,n-k-1);
		// last ke k element reverse
		Reverse(arr, n-k, n-1);
		// all elements reverse
		Reverse(arr, 0, n-1);
	}
	
	public static void Reverse(int [] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
