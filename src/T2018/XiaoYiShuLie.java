package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-01 15:10
 * @Description: 需要复习
 */
public class XiaoYiShuLie {

    static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] state = new int[n + 1][k + 1];
        state[0][1] = 1;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                sum = (sum + state[i - 1][j]) % mod;
            }
            for (int j = 1; j <= k; j++) {
                int invalid = 0;
                int p = 2;
                while (p * j <= k) {
                    invalid = (invalid + state[i - 1][p * j]) % mod;
                    p++;
                }
                state[i][j] = (sum - invalid + mod) % mod;
            }
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum = (sum + state[n][i]) % mod;
        }
        System.out.println(sum);
        scanner.close();
    }
}
