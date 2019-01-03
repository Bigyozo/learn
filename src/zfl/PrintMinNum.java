package zfl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-03 16:35
 * @Description: 打印数组的最小排列
 */
public class PrintMinNum {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        String s = "";
        for (int i : list) {
            s += i;
        }
        return s;
    }
}
