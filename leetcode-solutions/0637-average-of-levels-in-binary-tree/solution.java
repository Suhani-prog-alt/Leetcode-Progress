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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return l;
        q.offer(root);
        while(!q.isEmpty()){
            Double sum = 0.0;
            Double count = 0.0;
            int n = q.size();
            for(int i = 0; i<n; i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                sum+=(q.poll().val);
                count++;
            }
            l.add(sum/count);
        }
        return l;
    }
}
