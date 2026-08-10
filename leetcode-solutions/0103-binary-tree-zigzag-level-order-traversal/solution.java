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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return ll;
        q.offer(root);
        boolean pass = true;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i<n; i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                l.add(q.poll().val);
            }
            if(pass){
                ll.add(l);
                pass = false;
            }else{
                Collections.reverse(l);
                ll.add(l);
                pass = true;
            }
            
        }
        return ll;
    }

}
