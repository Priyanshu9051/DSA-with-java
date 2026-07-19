class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        Stack<ListNode> st = new Stack<>();

        ListNode f = head;
        ListNode s = head;
        ListNode h1 = head;

        // Find middle
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        // Second half
        ListNode h2 = s.next;
        s.next = null;

        // Push second half into stack
        while (h2 != null) {
            st.push(h2);
            h2 = h2.next;
        }

        // Merge both halves
        while (h1 != null && !st.isEmpty()) {

            ListNode temp = h1.next;
            ListNode last = st.pop();

            h1.next = last;
            last.next = temp;

            h1 = temp;
        }
    }
}