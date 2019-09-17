package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-03 16:09
 * @Description: 反转链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
