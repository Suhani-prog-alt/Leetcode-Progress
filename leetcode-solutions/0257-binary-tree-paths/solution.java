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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<>();
        String s = "";
        if(root == null) return l;
        check(root, l, s);
        return l;
    }

    public void check(TreeNode root, List<String> l, String s){
        if(root == null)return;
        if(root.left == null && root.right==null){
            String S = s+root.val;
            l.add(S);
            return;
        }
        
        check( root.left, l, s+root.val+"->");
        check(root.right, l, s+root.val+"->");
    }
}
