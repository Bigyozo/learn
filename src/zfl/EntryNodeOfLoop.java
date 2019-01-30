package zfl;

import java.util.HashSet;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-29 12:24
 * @Description: ${Description}
 */
public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> hashSet=new HashSet<>();
        while (pHead!=null) {
            if (!hashSet.add(pHead)) {
                return pHead;
            }
            pHead=pHead.next;
        }
        return null;
    }
}
