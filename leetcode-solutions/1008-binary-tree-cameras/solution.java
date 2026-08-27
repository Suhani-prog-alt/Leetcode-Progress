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
    int count  =0;
    public int minCameraCover(TreeNode root) {
        int x = Cover(root);
        return  x == -1 ? count+1: count;
    }
    public int Cover(TreeNode root) {
			if(root == null){
                return 0;
            }
			int l = Cover(root.left);
			int r = Cover(root.right);
			if(l == -1 || r == -1) {
				count++;
				return 1; // has a camera
			}
			else if(l == 1 || r == 1) {
				return 0; // already covered
			}else {
				return -1;
			}
		}
   
}
