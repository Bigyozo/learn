package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-09 10:19
 * @Description: ${Description}
 */
public class ZuiHouYiWei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = scanner.nextLong();
        long tar = getNum(sum, 0, (long) 1e18);
        System.out.println(tar);
    }

    private static long getNum(long sum, long from, long to) {
        while (from <= to) {
            long mid = (from + to) >> 1;
            long temp = caculate(mid);
            if (temp > sum)
                to = mid - 1;
            else if (temp < sum)
                from = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    private static long caculate(long mid) {
        long temp = 0;
        while (mid > 0) {
            temp += mid;
            mid /= 10;
        }
        return temp;
    }
}
