package zfl;

import java.util.LinkedList;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-17 15:42
 * @Description: ${Description}
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int rm = 0;
        while (list.size() > 1) {
            rm = (rm + m - 1) % list.size();
            list.remove(rm);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        LastRemaining lastRemaining = new LastRemaining();
        int out = lastRemaining.LastRemaining_Solution(5, 3);
        System.out.println(out);
    }
}
