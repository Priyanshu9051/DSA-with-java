class Solution {
    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode temp = head;
        int carry = 0;

        while (temp != null) {
            int sum = temp.val * 2 + carry;
            temp.val = sum % 10;
            carry = sum / 10;

            if (temp.next == null) {
                break;
            }

            temp = temp.next;
        }

        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}