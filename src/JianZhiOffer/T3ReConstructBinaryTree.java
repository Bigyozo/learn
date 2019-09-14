package JianZhiOffer;


import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/6/18/018 20:10
 * @Description:输入二叉树的前序遍历和中序遍历，重建出该二叉树
 */
public class T3ReConstructBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        TreeNode node=reConstructBinaryTree(str[0].toCharArray(), str[1].toCharArray());
        printT(node);
    }

    public static TreeNode reConstructBinaryTree(char[] pre, char[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private static TreeNode reConstructBinaryTree(char[] pre, int pfr, int pend, char[] in, int ifr, int iend) {
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

    static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        TreeNode(char x) {
            val = x;
        }
    }

    static void printT(TreeNode node){
        if (node.left!=null)
            printT(node.left);
        if(node.right!=null)
            printT(node.right);
        System.out.print(node.val);
    }
}
