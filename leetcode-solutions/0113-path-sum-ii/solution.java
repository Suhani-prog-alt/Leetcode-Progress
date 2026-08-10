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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        check( root, ll, l, 0, targetSum);
        return ll;
        
    }

    public void check(TreeNode root, List<List<Integer>> ll, List<Integer> l, int sum , int target){
        if(root == null) return;
        sum+=root.val;
        l.add(root.val);
        if(sum == target && root.left == null && root.right == null){
            ll.add(new ArrayList<>(l));
            l.remove(l.size()-1);
            return;
        }
        
        check(root.left, ll, l, sum, target);
        check(root.right, ll, l, sum, target);
        l.remove(l.size()-1);

    }
}
