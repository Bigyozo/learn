package zfl;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-18 16:41
 * @Description: 求一个数据流中的中位数
 */
public class GetMedianFromStream {
    int index = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        index++;
        if ((index & 1) == 1) {
            if (!minHeap.isEmpty() && num < minHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        } else {
            if (!maxHeap.isEmpty() && num > maxHeap.peek()) {
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
    }

    public Double GetMedian() {
        if ((index & 1) == 1)
            return minHeap.peek().doubleValue();
        else
            return (minHeap.peek().doubleValue() + maxHeap.peek().doubleValue()) / 2;
    }

}
