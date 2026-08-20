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
    // public boolean isBalanced(TreeNode root) {
    //     // boolean l = isBalanced(l);
    //     // boolean r = isBalanced(r);
    //     // boolean s = Math.abs(ht(l)-ht(r))<=1;

    // }
    public boolean isBalanced(TreeNode root) {
			return Balanced(root).isBal;
		}
		public BalPair Balanced(TreeNode root) {
			if(root == null) {
				return new BalPair();
			}
			BalPair left = Balanced(root.left);
			BalPair  right = Balanced(root.right);
			BalPair bp = new BalPair();
			bp.ht =Math.max(left.ht,right.ht)+1;
			bp.isBal = (Math.abs((left.ht - right.ht))<=1 ? true : false) && left.isBal && right.isBal; 
            return bp;
		}
		
		class BalPair{
			boolean isBal = true;
			int ht = -1;
		}
}
