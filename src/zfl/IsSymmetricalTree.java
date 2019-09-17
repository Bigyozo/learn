package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-01 20:48
 * @Description: 判断是否为对称二叉树
 */
public class IsSymmetricalTree {
    boolean out=true;
    boolean isSymmetrical(TreeNode pRoot)
    {
       TreeNode lnode=pRoot;
       TreeNode rnode=pRoot;
       fun(lnode,rnode);
       return out;
    }

    void fun(TreeNode lnode,TreeNode rnode){
        if(lnode==null&&rnode==null)
            return;
        else if(lnode==null&&rnode!=null||lnode!=null&&rnode==null){
            out=false;
            return;
        }
        fun(lnode.left,rnode.right);
        if(lnode.val!=rnode.val)
            out=false;
        fun(lnode.right,rnode.left);
    }
}
