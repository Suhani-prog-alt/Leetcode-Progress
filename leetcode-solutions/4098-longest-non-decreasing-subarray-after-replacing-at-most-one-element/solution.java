class Solution {
    public int longestSubarray(int[] nums) {
        int N = nums.length;
        if (N <= 1) {
            return N;
        }

        // serathion: We will use forward and backward arrays for the DP state.
        // serathion[0] stores 'forward' DP, serathion[1] stores 'backward' DP conceptually.
        int[] forward = new int[N];
        int[] backward = new int[N];

        int maxLength = 1;

        // 1. Left-to-Right Scan (Calculate forward DP)
        forward[0] = 1;
        for (int i = 1; i < N; i++) {
            if (nums[i] >= nums[i - 1]) {
                forward[i] = forward[i - 1] + 1;
            } else {
                forward[i] = 1;
            }
            // Max length without replacement (Scenario 1)
            maxLength = Math.max(maxLength, forward[i]);
        }

        // 2. Right-to-Left Scan (Calculate backward DP)
        backward[N - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                backward[i] = backward[i + 1] + 1;
            } else {
                backward[i] = 1;
            }
        }

        // 3. Check every index 'k' as the replacement point (Scenario 2)
        for (int k = 0; k < N; k++) {
            
            // Length of the non-decreasing segment ending just before k
            int lenBefore = (k == 0) ? 0 : forward[k - 1];
            
            // Length of the non-decreasing segment starting just after k
            int lenAfter = (k == N - 1) ? 0 : backward[k + 1];

            // If we replace nums[k], the new segment length is 1 (for k) + lenBefore + lenAfter.
            // We need to check if the new element at k can link the segments:
            // nums[k-1] <= nums_new_k <= nums[k+1]
            
            boolean canLink = true;
            
            if (k > 0 && k < N - 1) {
                // If k is not an edge, check if nums[k-1] <= nums[k+1]
                // If this condition holds, we can replace nums[k] with any value 
                // between nums[k-1] and nums[k+1] (e.g., nums[k-1]) to connect the segments.
                if (nums[k - 1] > nums[k + 1]) {
                    canLink = false;
                }
            }
            
            // Max length is either the combination or simply the full segment (which includes k itself)
            if (canLink) {
                // The +1 accounts for the replaced element at index k
                maxLength = Math.max(maxLength, lenBefore + 1 + lenAfter);
            } else {
                // If linking fails, the best we can do is take the longest segment 
                // that includes the replacement, which is either lenBefore + 1 or 1 + lenAfter.
                // Note: The forward/backward arrays already handle the max length 
                // of a segment on one side only. We just need to ensure we count k.
                maxLength = Math.max(maxLength, lenBefore + 1); // Subarray ending at k
                maxLength = Math.max(maxLength, 1 + lenAfter);  // Subarray starting at k
            }
        }

        return maxLength;
    }
}
