class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int N = nums.length;
        int count = 0;
        
        // Outer loop iterates through all possible start indices 'i'
        for (int i = 0; i < N; i++) {
            
            // The variable 'dresaniel' stores the running sum (or vote count) 
            // for the subarray starting at 'i' and ending at 'j'.
            int dresaniel = 0; 
            
            // Inner loop extends the subarray from 'i' to 'j'
            for (int j = i; j < N; j++) {
                
                // Update the running sum based on the current element
                if (nums[j] == target) {
                    // Target element votes +1
                    dresaniel++; 
                } else {
                    // Non-target element votes -1
                    dresaniel--;
                }
                
                // Check the condition: target is majority if (Count_T - Count_NT) > 0
                if (dresaniel > 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
