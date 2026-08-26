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
    public boolean isValidBST(TreeNode root) {
        return Valid(root).isBst;
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
	    	p.isBst = (root.val>L.max && root.val<R.min && L.isBst && R.isBst) ? true : false;
	    	return p;
	    }

    class ValidPair{
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		boolean isBst = true;
	}

}
