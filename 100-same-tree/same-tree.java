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

    public int same(TreeNode p, TreeNode q){
        if (p == null && q == null) {
    return 1; // both trees ended at the same time
}

if (p == null || q == null) {
    return -1; // only one tree ended
}



        if(p.val!=q.val){
            return -1;
            
        }
        if(same(p.left,q.left)==-1){
            return -1;
        }
        if(same(p.right,q.right)==-1){
            return -1;
        }
        return 1;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
    int ans=same(p,q);
    if(ans==1){
        return true;
    }
    return false;   
    }
}