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
    
    // public void ListAdd(TreeNode root,List<Integer>L){
    //     if(root==null) return ;
    //     L.add(root.val);
    //    ListAdd(root.left,L);
    //    ListAdd(root.right,L);
        

    // }
    public List<Integer> preorderTraversal(TreeNode root) {
       
        List<Integer> L=new ArrayList<>();
        // ListAdd(root,L);
     if(root==null) return L;
        Stack<TreeNode> st=new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();

            L.add(node.val);
            if(node.right!=null) st.add(node.right);
            if(node.left!=null) st.add(node.left);
            
        }
        return L;

        
    }
}