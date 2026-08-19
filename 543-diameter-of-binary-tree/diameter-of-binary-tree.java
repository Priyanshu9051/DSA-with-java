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
    int diameter=0;
    int Max(TreeNode root){
        if(root==null) return 0;
        int leftHeight=Max(root.left);
        int rightHeight=Max(root.right);

         diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1+Math.max(leftHeight,rightHeight);
    
    }
    //  int rightMax(TreeNode root){
    //     if(root==null) return 0;
    //     return 1+Math.max(leftMax(root.left),rightMax(root.right));
    
    // }

    public int diameterOfBinaryTree(TreeNode root) {
        Max(root);
        return diameter;
        
    }
}