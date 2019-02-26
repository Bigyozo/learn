package T2018;

import java.util.Scanner;


/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-25 16:53
 * @Description: ${Description}
 */
public class JiaoCuo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(get01Length(str));
    }

    private static int get01Length(String str) {
        int count = 1, max = 1;
        char[] chars = str.toCharArray();
        char a = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != a) {
                a = chars[i];
                count++;
                if (count > max)
                    max = count;
            } else {
                a = chars[i];
                count = 1;
            }
        }
        return max;
    }
}
