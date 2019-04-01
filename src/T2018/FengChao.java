package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-27 19:18
 * @Description: ${Description}
 */
public class FengChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][3];
        for (int i = 1; i <= 5; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = 0;
        }
        double out = 0.0;
        int k = 0, m = 0,count=0;
        while (count<5) {
            double min = Double.MAX_VALUE;
            for (int i = 1; i <= 5; i++) {
                if (arr[i][2] > 0)
                    continue;
                double len = getLen(k, i, arr);
                if (len < min) {
                    min = len;
                    m = i;
                }
            }
            arr[m][2]++;
            k = m;
            out+=min;
            count++;
        }
        out+=getLen(k,0,arr);
        System.out.println((int)out);
    }

    public static double getLen(int k, int j, int[][] arr) {
        return Math.sqrt((arr[k][0] - arr[j][0]) * (arr[k][0] - arr[j][0]) + (arr[k][1] - arr[j][1]) * (arr[k][1] - arr[j][1]));
    }
}
