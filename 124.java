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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        int l = helper(node.left);
        int r = helper(node.right);
        l = Math.max(0,l);//Ignore negative value in right or left as if its negative its gonna reduce the overall answer
        r = Math.max(0,r);

        int pathSum = l + r + node.val;
        ans = Math.max(ans,pathSum);

        return Math.max(l,r) + node.val;
    }
}
