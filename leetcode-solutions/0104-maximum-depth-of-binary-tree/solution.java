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
    public int maxDepth(TreeNode root) {
        return deep( root);
        
    }

    public int deep(TreeNode nn){
        if(nn==null){
            return 0;
        }
        int l = deep(nn.left);
        int r = deep(nn.right);
        return Math.max(l,r)+1;
    }
}
