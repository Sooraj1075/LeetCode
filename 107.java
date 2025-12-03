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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int level = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i =0 ;i<level;i++)
            {
                TreeNode currNode = q.poll();
                curr.add(currNode.val);
                if(currNode.left != null)
                {
                    q.offer(currNode.left);
                }
                if(currNode.right != null)
                {
                    q.offer(currNode.right);
                }
            }
            result.add(curr);

        }
        Collections.reverse(result);//just reverse the final list of 102 qn
        return result;
    }
}
