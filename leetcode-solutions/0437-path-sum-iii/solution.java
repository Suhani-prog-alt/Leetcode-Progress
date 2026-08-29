/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Long> mp = new HashMap<>();
        mp.put(0L,1L);
        check(root, targetSum, mp, 0L);
        return count;

    }
    public void check(TreeNode root, int target, Map<Long, Long> mp, long sum){
        if(root == null)return;
        // if(mp.containsKey(sum+root.val - target))count++;
        count += mp.getOrDefault(sum+root.val - target, 0L);
        mp.put(sum+root.val, mp.getOrDefault(sum+root.val,0L)+1);
        check(root.left, target, mp, sum+root.val);
        check(root.right, target, mp, sum+root.val);
        mp.put(sum+root.val, mp.get(sum+root.val)-1);
        return;
    }
}
