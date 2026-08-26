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
    public int maxSumBST(TreeNode root) {
        return Valid(root).ans;
    }
    public ValidPair Valid(TreeNode root) {
    	if(root == null) {
    		return new ValidPair();
    	}
    	
    	ValidPair L = Valid(root.left);
    	ValidPair R = Valid(root.right);
    	ValidPair p = new ValidPair();
    	p.min = Math.min(L.min, Math.min(R.min, root.val));
    	p.max = Math.max(L.max, Math.max(R.max, root.val));
    	p.sum = L.sum+ R.sum + root.val;
    	if(L.isBst && R.isBst && L.max < root.val && R.min > root.val) {
    		p.isBst = true;
    		p.ans = Math.max(L.ans, Math.max(R.ans, p.sum));
    	}else {
    		p.isBst = false;
    		p.ans = Math.max(L.ans,R.ans);
    	}
    	return p;
    }
    class ValidPair{
		long max = Integer.MIN_VALUE;
		long min = Integer.MAX_VALUE;
		boolean isBst = true;
		int sum = 0;
		int ans = 0;
	}
}
