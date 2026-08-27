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
    public int distributeCoins(TreeNode root) {
        return distri(root).count;
    }
    public Pair distri(TreeNode root) {
			if(root == null) {
				return new Pair();
			}
			Pair l = distri(root.left);
			Pair r = distri(root.right);
			Pair sp = new Pair();
			
			sp.count  = l.count + r.count + Math.abs(l.requirement) + Math.abs(r.requirement);
			sp.requirement = l.requirement + r.requirement + root.val - 1;
			return sp;
			
		}
        class Pair{
		int count = 0;
		int requirement = 0;
	}
}
