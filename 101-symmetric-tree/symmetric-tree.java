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
    public int check(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return 1;
        }
        if(p==null||q==null){
            return -1;
        }
        
        if(p.val!=q.val){
            return -1;
        }
        if(check(p.left,q.right)==-1){
            return -1;
        }
         if(check(p.right,q.left)==-1){
            return -1;
        }
        return 1;

    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null&&root.right==null) return true;
        TreeNode p=root.left;
        TreeNode q=root.right;
       int ans= check(p,q);
       if(ans==-1){
        return false;

       }
       return true;

        
    }
}