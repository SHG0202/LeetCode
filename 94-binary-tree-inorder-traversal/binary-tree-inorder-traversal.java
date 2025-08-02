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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        getInorderList(root, tree);
        return tree;
    }

    public void getInorderList(TreeNode node, List<Integer> tree){
        if(node != null){
            getInorderList(node.left,tree);
            tree.add(node.val);
            getInorderList(node.right,tree);
        }
    }
}