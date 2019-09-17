package zfl;
/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-03 16:05
 * @Description: 由前序遍历及中序遍历重建二叉树
 */
public class ReConstructBinaryTree {
    public zfl.TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int pfr, int pend, int[] in, int ifr, int iend) {
        if (pfr > pend || ifr > iend)
            return null;
        TreeNode node = new TreeNode(pre[pfr]);
        for (int i = ifr; i <= iend; i++) {
            if (pre[pfr] != in[i])
                continue;
            else {
                node.left = reConstructBinaryTree(pre, pfr + 1, pfr + i - ifr, in, ifr, i - 1);
                node.right = reConstructBinaryTree(pre, pfr + i - ifr + 1, pend, in, i + 1, iend);
                break;
            }
        }
        return node;
    }

    public static void main(String[] args){
        ReConstructBinaryTree reConstructBinaryTree=new ReConstructBinaryTree();
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        zfl.TreeNode node=reConstructBinaryTree.reConstructBinaryTree(pre,in);
        System.out.println(node);
    }

}
