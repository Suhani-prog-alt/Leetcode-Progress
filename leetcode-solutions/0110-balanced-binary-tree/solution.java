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
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        check(root);
        return ans;
    }

    public int check(TreeNode root){
        if(root == null)return 0;
        if(!ans)return 0;
        int left = check(root.left);
        int right = check(root.right);
        int diff = Math.abs(right - left);
        if(diff>1) ans = false;
        return Math.max(left, right)+1;

    }
}
