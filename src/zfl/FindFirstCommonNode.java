package zfl;

import java.util.HashSet;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-07 16:26
 * @Description: 找链表公共节点
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (pHead1 != null || pHead2 != null) {
            if (pHead1 != null) {
                if (!hashSet.add(pHead1))
                    return pHead1;
                else
                    pHead1 = pHead1.next;
            }
            if (pHead2 != null) {
                if (!hashSet.add(pHead2))
                    return pHead2;
                else
                    pHead2 = pHead2.next;
            }
        }
        return null;
    }
}
