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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkEqual(p,q);
    }

    public boolean checkEqual(TreeNode p, TreeNode q){
        if(p != null && q != null){
            if(checkEqual(p.left, q.left) == false) {return false;}
            if(p.val != q.val) {return false;}
            if(checkEqual(p.right, q.right) == false) {return false;} 
        }else if((p == null && q != null) || (q == null && p != null)){
            return false;
        }
        return true;
    }

}