package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-09 14:59
 * @Description: 求二叉树的深度
 */
public class TreeDepth {
    int maxdepth = 0;

    public int getTreeDepth(TreeNode root) {
        getDepth(0, root);
        return maxdepth;
    }

    private void getDepth(int depth, TreeNode node) {
        if (node == null)
            return;
        depth++;
        if (depth > maxdepth)
            maxdepth = depth;
        getDepth(depth, node.left);
        getDepth(depth, node.right);
    }
}
