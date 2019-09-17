package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-12 15:52
 * @Description: 二叉树的序列化
 */
public class TreeSerialize {
    int index = -1;
    String[] strings = null;

    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(Integer.valueOf(root.val) + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;
        if (index == 0) {
            strings = str.split(",");
        }
        if (index >= strings.length)
            return null;
        TreeNode node = null;
        if (!strings[index].equals("#")) {
            node = new TreeNode(Integer.parseInt(strings[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
