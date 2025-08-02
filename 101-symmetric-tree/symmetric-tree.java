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
    public boolean isSymmetric(TreeNode root) {
        return isSimmTree(root.left, root.right);
    }

    public boolean isSimmTree(TreeNode p, TreeNode q) {
        if(p != null && q != null){
            if(p.val != q.val){
                return false;
            }
            if (isSimmTree(p.left, q.right) == false){
                return false;
            }
            if(isSimmTree(p.right, q.left) == false){
                return false;
            }
        }else if(p == null && q == null){
            return true;
        }else{
            return false;
        }
        return true;
    }
}