package T2018;

import java.util.Scanner;

public class KongZhongLvXing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = scanner.nextInt();
        }
        int count = 0;
        while (count < n && f[count] <= s) {
            s -= f[count];
            count++;
        }
        System.out.println(count);
    }
}
