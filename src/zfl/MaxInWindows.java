package zfl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-18 17:24
 * @Description: 求所有窗口中最大值
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size <= 0)
            return list;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int count = 0;
        for (int i = 0; i <= num.length - size; i++) {
            while (queue.size() < size) {
                queue.offer(num[i + count]);
                count++;
            }
            list.add(queue.peek());
            queue.clear();
            count = 0;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 2, 6, 2, 5, 1};
        MaxInWindows maxInWindows = new MaxInWindows();
        maxInWindows.maxInWindows(num, 3);
    }
}
