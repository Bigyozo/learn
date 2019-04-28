package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/28/028 16:22
 * @Description:
 */
public class YidongFanWei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[][] arr = new boolean[m][n];
        int res = helper(0, 0, m, n, k, arr);
        System.out.println(res);
    }

    private static int helper(int i, int j, int m, int n, int k, boolean[][] arr) {
        if (i < 0 || i >= m || j < 0 || j >= n || arr[i][j] == true)
            return 0;
        int temp = 0;
        for (int t = i; t > 0; t = t / 10) {
            temp += t % 10;
        }
        for (int t = j; t > 0; t = t / 10) {
            temp += t % 10;
        }
        if (temp > k)
            return 0;
        arr[i][j] = true;
        return 1+helper(i + 1, j, m, n, k, arr) + helper(i - 1, j, m, n, k, arr)
                + helper(i, j + 1, m, n, k, arr) + helper(i, j - 1, m, n, k, arr);
    }

}
