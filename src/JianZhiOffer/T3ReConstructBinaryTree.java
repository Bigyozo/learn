package JianZhiOffer;




/**
 * @Auther: zhangfanglong
 * @Date: 2019/6/18/018 20:10
 * @Description:输入二叉树的前序遍历和中序遍历，重建出该二叉树
 */
public class T3ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    private TreeNode reConstructBinaryTree(int[] pre,int pfr,int pend,int[] in,int ifr,int iend){
        if(pfr>pend||ifr>iend)
            return null;
        TreeNode node=new TreeNode(pre[pfr]);
        for(int i=ifr;i<=iend;i++){
            if(pre[pfr]!=in[i])
                continue;
            else {
                node.left=reConstructBinaryTree(pre,pfr+1,pfr+i-ifr,in,ifr,i-1);
                node.right=reConstructBinaryTree(pre,pfr+i-ifr+1,pend,in,i+1,iend);
                break;
            }
        }
        return node;
    }
}
