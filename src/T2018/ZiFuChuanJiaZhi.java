package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-04 14:54
 * @Description: ${Description}
 */
public class ZiFuChuanJiaZhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = scanner.nextInt();
        int[] vArr = new int[26];
        int max = 0, maxp = 0;
        for (int i = 0; i < line.length(); i++) {
            int offset = line.charAt(i) - 'a';
            vArr[offset]++;
            if (vArr[offset] > max) {
                max = vArr[offset];
                maxp = offset;
            }
        }
        if (n > 0) {
            vArr[maxp]--;
            n--;
            max = 0;
        }
        while (n > 0) {
            for (int i = 0; i < 26; i++) {
                if (vArr[i] > max) {
                    max = vArr[i];
                    maxp = i;
                }
            }
            vArr[maxp]--;
            n--;
            max = 0;
        }
        int value = 0;
        for (int i = 0; i < 26; i++) {
            value += vArr[i] * vArr[i];
        }
        System.out.println(value);
    }
}
