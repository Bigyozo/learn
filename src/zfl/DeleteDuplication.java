package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-29 12:56
 * @Description: 排序的链表中，删除该链表中重复的结点，重复的结点不保留
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return pHead;
        if (pHead.val == pHead.next.val) {
            ListNode node = pHead.next;
            while (node != null && node.val == pHead.val) {
                node = node.next;
            }
            return deleteDuplication(node);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
