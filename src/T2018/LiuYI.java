package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-22 16:10
 * @Description: 分配巧克力
 */
public class LiuYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < h.length; i++)
            h[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] w = new int[m];
        for (int i = 0; i < w.length; i++) {
            w[i] = scanner.nextInt();
        }
        int out = foo(h, w);
        System.out.println(out);
    }

    private static int foo(int[] h, int[] w) {
        Arrays.sort(h);
        Arrays.sort(w);
        int count = 0;
        for (int i = 0, j = 0; i < h.length && j < w.length; ) {
            if (w[j] >= h[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
