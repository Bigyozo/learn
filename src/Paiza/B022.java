package Paiza;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/11/4/004 22:13
 * @Description:選挙の演説
 */
public class B022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[m + 1];
        while (k-- > 0) {
            int a = sc.nextInt();
            if (n > 0) {
                n--;
                arr[a]++;
            }
            for (int i = 1; i <= m; i++) {
                if (a == i)
                    continue;
                if (arr[i] > 0) {
                    arr[i]--;
                    arr[a]++;
                }
            }
        }
        int max = 0;
        int loc = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                loc = i;
            }
        }
        System.out.println(loc);
        for (int i = loc+1; i < arr.length; i++) {
            if (arr[i] == max)
                System.out.println(i);
        }
    }
}
