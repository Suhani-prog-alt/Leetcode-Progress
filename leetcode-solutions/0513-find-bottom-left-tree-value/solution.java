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
    
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        check(root, l);
        return l.get(l.size()-1).getFirst();

    }

    public void check(TreeNode  root, List<List<Integer>> l ){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for(int i  = 0; i<size; i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                ll.add(q.poll().val);
            }
            l.add(ll);
        }
    }
}
