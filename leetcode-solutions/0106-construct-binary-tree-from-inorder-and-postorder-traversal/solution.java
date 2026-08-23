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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        return check(postorder, new int[]{inorder.length -1}, inorder, 0, inorder.length -1);
    }

    public TreeNode check(int [] post, int []curr, int [] in, int si, int ei){
        if(ei<si || curr[0]<0){
            return null;
        }
        TreeNode n = new TreeNode(post[curr[0]]);
        curr[0]--;
        int search = sea(post[curr[0]+1], in);
        TreeNode righ = check(post, curr, in , search+1, ei);
        TreeNode lef = check(post, curr, in, si, search-1);
        
        n.left = lef;
        n.right = righ;
        return n;
    }
    public int sea(int val, int  []arr){
        for(int i= 0; i<arr.length; i++){
            if(val == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
