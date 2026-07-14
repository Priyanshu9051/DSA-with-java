/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        
        ListNode i=head;
        
        Stack<ListNode> st=new Stack<>();
        
        while(i!=null){
          
                while(st.size()>0&&st.peek().val<i.val){
                    st.pop();

                }
                st.push(i);
                i=i.next;              
            }
        
        while(st.size()>0){
            ListNode top =st.pop();
            top.next=i;
            i=top;

        }
        return i;
        

        
    }
}