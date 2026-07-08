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


    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ArrayList<ListNode> arr=new ArrayList<>();
        for(ListNode n: lists) arr.add(n);
        while(arr.size()>1){
            ListNode a=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c=merge(a,b);
            arr.add(c);


        }
        return arr.get(0);
        
    }
ListNode merge(ListNode i,ListNode j){
   
    ListNode a=i;
    ListNode b=j;
     ListNode c=new ListNode(-1);
    ListNode ans=c;
    while(a!=null&&b!=null){
        if(a.val<=b.val){
            c.next=a;
            a=a.next;
        }
        else{
            c.next=b;
            b=b.next;
        }
        c=c.next;
    }
    if(a!=null){
        c.next=a;
    }
    else{
        c.next=b;
    }
    return ans.next;


}
}