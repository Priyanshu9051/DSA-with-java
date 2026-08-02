/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                break;
            }
        }
        if(f==null||f.next==null){
            return null;
        }
        ListNode n1=head;
        ListNode n2=s;
        while(n1!=n2){
            n1=n1.next;
            n2=n2.next;
        }
        return n1;
        
    }
}