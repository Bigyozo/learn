package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-19 16:52
 * @Description: 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 */
public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (helper(matrix, rows, cols, i, j, str, 0, flag))
                    return true;
            }
        return false;
    }

    private boolean helper(char[] matrix, int rows, int cols, int i, int j, char[] str, int num, boolean[] flag) {
        int index = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || flag[index] == true || matrix[index] != str[num])
            return false;
        if (num == str.length - 1) {
            return true;
        }
        flag[index] = true;
        if (helper(matrix, rows, cols, i - 1, j, str, num + 1, flag) ||
                helper(matrix, rows, cols, i + 1, j, str, num + 1, flag) ||
                helper(matrix, rows, cols, i, j - 1, str, num + 1, flag) ||
                helper(matrix, rows, cols, i, j + 1, str, num + 1, flag)) {
            return true;
        }
        flag[index] = false;
        return false;
    }


}
