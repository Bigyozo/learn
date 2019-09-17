package zfl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-12 10:28
 * @Description: 打印二叉树
 */
public class PrintTree {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<TreeNode> queue1 = new ArrayList<>();
        ArrayList<TreeNode> queue2 = new ArrayList<>();
        queue1.add(pRoot);
        int line = 1;
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (line % 2 == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!queue1.isEmpty()) {
                    TreeNode node = queue1.remove(0);
                    if (node != null) {
                        temp.add(node.val);
                        queue2.add(node.left);
                        queue2.add(node.right);
                    }
                }
                if(!temp.isEmpty()) {
                    result.add(temp);
                }
                line++;
            }
            if (line % 2 == 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!queue2.isEmpty()) {
                    TreeNode node = queue2.remove(0);
                    if (node != null) {
                        temp.add(node.val);
                        queue1.add(node.left);
                        queue1.add(node.right);
                    }
                }
                if(!temp.isEmpty()) {
                    result.add(temp);
                }
                line++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        PrintTree printTree = new PrintTree();
        List list = printTree.Print(root);
        System.out.println(list);
    }
}
