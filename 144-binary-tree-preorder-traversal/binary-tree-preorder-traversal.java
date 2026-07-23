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
    
    public void ListAdd(TreeNode root,List<Integer>L){
        if(root==null) return ;
        L.add(root.val);
       ListAdd(root.left,L);
       ListAdd(root.right,L);
        

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> L=new ArrayList<>();
        ListAdd(root,L);
        return L;

        
    }
}