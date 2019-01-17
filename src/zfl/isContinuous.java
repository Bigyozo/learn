package zfl;

import java.util.Arrays;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-16 16:38
 * @Description: ${Description}
 */
public class isContinuous {
    public boolean isContinuous(int[] numbers) {
        Arrays.sort(numbers);
        int zero = 0, gap = 0, cur = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                zero++;
            else if (cur == 0) {
                cur = numbers[i];
            } else if (numbers[i] == cur) {
                return false;
            } else if (numbers[i] > cur + 1) {
                gap += numbers[i] - cur - 1;
                cur = numbers[i];
            } else {
                cur = numbers[i];
            }
        }
        return zero >= gap;
    }

    public static void main(String[] args) {
        isContinuous isContinuous = new isContinuous();
        boolean b = isContinuous.isContinuous(new int[]{1, 3, 0, 7, 0});
        System.out.println(b);
    }
}
