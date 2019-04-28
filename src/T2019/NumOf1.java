package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/28/028 16:12
 * @Description:
 */
public class NumOf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int count = 0;
        while (k > 0) {
            if ((k & 1) == 1)
                count++;
            k = k >> 1;
        }
        System.out.println(count);
    }
}
