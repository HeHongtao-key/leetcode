package RemoveLinkedListElements;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //删除头部等于val的元素
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode first = head;
        ListNode second = head.next;
        //删除第二个位置等于val的元素
        while (second != null) {
            if (second.val == val) {
                first.next = second.next;
                second = second.next;
            } else {
                first = second;
                second = second.next;
            }
        }
        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
