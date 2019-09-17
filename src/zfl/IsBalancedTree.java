package zfl;


/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-09 15:25
 * @Description: 判断二叉树是否是平衡二叉树
 */
public class IsBalancedTree {
    boolean flag = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return flag;
    }

    private int getDepth(TreeNode node) {
        if (node == null)
            return 0;
        int left = getDepth(node.left);
        int right = getDepth(node.right);
        if (Math.abs(left - right) > 1)
            flag = false;
        return Math.max(left, right) + 1;
    }
}
