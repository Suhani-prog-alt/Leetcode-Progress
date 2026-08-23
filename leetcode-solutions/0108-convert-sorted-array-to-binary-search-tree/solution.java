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
    public TreeNode sortedArrayToBST(int[] nums) {
        int si = 0;
        int ei = nums.length-1;
        TreeNode n = check(nums, si, ei);
        return n;
    }

    public TreeNode check( int [] nums, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode n = new TreeNode(nums[mid]);
        TreeNode lef = check(nums, si, mid - 1);
        n.left = lef;
        TreeNode rig = check(nums, mid+1, ei);
        n.right = rig;
        return n;
    }

}
