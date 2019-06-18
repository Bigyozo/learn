package JianZhiOffer;



import java.util.ArrayList;
import java.util.Collections;


/**
 * @Auther: zhangfanglong
 * @Date: 2019/6/17/017 20:46
 * @Description:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */
public class T3PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;
        }
        Collections.reverse(list);
        return list;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
