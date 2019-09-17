package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-03 16:13
 * @Description: 合并两个单调增的链表
 */
public class ListMerge {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode newNode = null, fNode = null;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (newNode != null) {
                    newNode.next = list1;
                    newNode = newNode.next;
                } else {
                    newNode = list1;
                    fNode = newNode;
                }
                list1 = list1.next;
            } else {
                if (newNode != null) {
                    newNode.next = list2;
                    newNode = newNode.next;
                } else {
                    newNode = list2;
                    fNode = newNode;
                }
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            if (newNode == null) {
                newNode = list1;
                fNode = newNode;
            } else {
                newNode.next = list1;
            }

        }
        if (list2 != null) {
            if (newNode == null) {
                newNode = list2;
                fNode = newNode;
            } else {
                newNode.next = list2;
            }
        }
        return fNode;
    }
}
