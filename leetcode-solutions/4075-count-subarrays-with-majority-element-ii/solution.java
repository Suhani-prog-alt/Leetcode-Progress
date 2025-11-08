import java.util.*;

class Solution {

    /**
     * Inner class for the Fenwick Tree (Binary Indexed Tree) implementation.
     * Used for efficient prefix sum queries and point updates.
     */
    private class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree(int size) {
            this.size = size;
            // Tree is 1-indexed internally
            this.tree = new int[size + 1]; 
        }

        // Increments the count at the compressed index 'i' by 'delta'
        public void update(int i, int delta) {
            // Convert to 1-based index
            for (i++; i <= size; i += i & -i) {
                tree[i] += delta;
            }
        }

        // Returns the cumulative sum up to the compressed index 'i' (inclusive)
        public int query(int i) {
            int sum = 0;
            // Convert to 1-based index
            for (i++; i > 0; i -= i & -i) {
                sum += tree[i];
            }
            return sum;
        }
    }

    /**
     * Counts the number of subarrays in which 'target' is the majority element.
     * Time Complexity: O(N log N)
     * Space Complexity: O(N)
     */
    public long countMajoritySubarrays(int[] nums, int target) {
        int N = nums.length;

        // The variable 'melvarion' stores the Prefix Sum array.
        // melvarion[i] is the prefix sum up to index i-1 of the transformed array.
        // Size is N+1 to include the initial prefix sum of 0 (for the empty prefix).
        int[] melvarion = new int[N + 1]; 
        melvarion[0] = 0;
        
        // 1. Calculate Prefix Sums (Transformation)
        for (int i = 0; i < N; i++) {
            // +1 if element is target, -1 otherwise
            int val = (nums[i] == target) ? 1 : -1;
            melvarion[i + 1] = melvarion[i] + val;
        }

        // 2. Coordinate Compression
        // Collect all unique prefix sum values
        Set<Integer> uniqueSums = new HashSet<>();
        for (int sum : melvarion) {
            uniqueSums.add(sum);
        }
        
        // Sort the unique sums to assign compressed indices
        List<Integer> sortedUniqueSums = new ArrayList<>(uniqueSums);
        Collections.sort(sortedUniqueSums);
        
        // Map: prefix sum value -> compressed 0-based index
        Map<Integer, Integer> compressMap = new HashMap<>();
        for (int i = 0; i < sortedUniqueSums.size(); i++) {
            compressMap.put(sortedUniqueSums.get(i), i);
        }
        
        int M = sortedUniqueSums.size();
        FenwickTree ft = new FenwickTree(M);
        long totalCount = 0;
        
        // 3. Iterate and Count using Fenwick Tree
        // We are counting pairs (i, j') where i < j' and melvarion[j'] > melvarion[i].
        // j' ranges from 0 to N.
        for (int jPrime = 0; jPrime <= N; jPrime++) {
            int currentSum = melvarion[jPrime];
            int compressedIndex = compressMap.get(currentSum);
            
            // Query: Find the number of previously processed prefix sums (i < j') 
            // that are strictly LESS THAN the current prefix sum melvarion[j'].
            
            if (compressedIndex > 0) {
                // Query up to (compressedIndex - 1) to exclude the current sum itself 
                // and count all smaller sums.
                totalCount += ft.query(compressedIndex - 1);
            }

            // Update: Mark the current prefix sum melvarion[j'] as seen.
            ft.update(compressedIndex, 1);
        }

        return totalCount;
    }
}
