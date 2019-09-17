package zfl;

import java.util.ArrayList;
import java.util.Stack;


/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-02 11:38
 * @Description: 之字形打印二叉树
 */
public class PrintTreeInZ {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(pRoot);
        int line = 1;
        while (!s1.empty() || !s2.empty()) {
            if (line % 2 == 1) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    lists.add(temp);
                    line++;
                }
            } else if (line % 2 == 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    lists.add(temp);
                    line++;
                }
            }
        }
        return lists;
    }

}
