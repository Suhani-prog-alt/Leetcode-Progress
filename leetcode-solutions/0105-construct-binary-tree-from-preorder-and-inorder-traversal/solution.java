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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return check(preorder, new int[]{0}, inorder, 0, inorder.length-1);
    }

    public TreeNode check(int [] pre, int [] curr, int [] inorder, int first, int last){
        if(last<first || curr[0]>=pre.length ){
            return null;
        }
        TreeNode n = new TreeNode(pre[curr[0]]);
        curr[0]++;
        int search = sea(pre[curr[0]-1], inorder);
        TreeNode lef = check(pre, curr, inorder, first, search-1);
        TreeNode righ = check(pre, curr, inorder, search+1, last);
        n.left = lef;
        n.right = righ;
        return n;
    }

    public int sea(int val, int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(val == arr[i])return i;
        }
        return -1;
    }
}
