package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-30 10:54
 * @Description: 给定二叉树一个结点，找出中序遍历顺序的下一个结点。
 * 树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class GetNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null)
            return null;
        if(pNode.right!=null){
            pNode=pNode.right;
            while(pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        while(pNode.next!=null){
            if(pNode.next.left==pNode)
                return pNode.next;
            else if(pNode.next.right==pNode)
                pNode=pNode.next;
        }
        return null;
    }

    static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
