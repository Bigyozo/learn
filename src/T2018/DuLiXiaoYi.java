package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-26 15:39
 * @Description: ${Description}
 */
public class DuLiXiaoYi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int day = getDay(x, f, d, p);
        System.out.println(day);
    }

    private static int getDay(int x, int f, int d, int p) {
        if(x*f>=d)
            return d/x;
        return f+(d-x*f)/(p+x);
    }
}
