/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode root) {
        List<String> l =new ArrayList<>();
        helper(root,l);
        return l;
    }

    public void helper(TreeNode node,List<String> list)
    {
        if(node == null)
        {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left,list);
        helper(node.right,list);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> list) {
        Collections.reverse(list);
        TreeNode node = helper2(list);
        return node;
    }

    TreeNode helper2(List<String> list)
    {
        String v = list.remove(list.size() - 1);
        if(v.charAt(0) == 'n')
        {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(v));
        root.left = helper2(list);
        root.right = helper2(list);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
