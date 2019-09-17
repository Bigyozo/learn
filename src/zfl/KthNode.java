package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-18 15:50
 * @Description: 二叉搜索树中的第k小的结点
 */
public class KthNode {
    int idx = 0;
    TreeNode out=null;

    TreeNode KthNode(TreeNode pRoot, int k) {
        Kth(pRoot,k);
        return out;
    }

    void Kth(TreeNode pRoot, int k){
        if(pRoot!=null){
            Kth(pRoot.left,k);
            idx++;
            if(idx==k)
                out=pRoot;
            Kth(pRoot.right,k);
        }
    }
}
