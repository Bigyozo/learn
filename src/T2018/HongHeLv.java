package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-05 16:50
 * @Description: ${Description}
 */
public class HongHeLv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        char[] chars = line.toCharArray();
        int min = Integer.MAX_VALUE, minp = -1;
        for (int i = 0; i < chars.length; i++) {
            int ng1 = 0, nr2 = 0;
            for (int j = 0; j < chars.length; j++) {
                if (j <= i && chars[j] == 'G')
                    ng1++;
                else if (j > i && chars[j] == 'R')
                    nr2++;
            }
            if (ng1 + nr2 < min) {
                min = ng1 + nr2;
                minp = i;
            }
        }
        int count = 0, countR = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i <= minp && chars[i] == 'G')
                count++;
            else if (i <= minp && chars[i] == 'R')
                countR++;
            else if (i > minp && chars[i] == 'R') {
                count++;
                countR++;
            }
        }
        if (count <= countR)
            System.out.println(count);
        else System.out.println(countR);
    }
}
