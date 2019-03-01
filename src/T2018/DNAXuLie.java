package T2018;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-01 16:44
 * @Description: ${Description}
 */
public class DNAXuLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int i, j, n = line.length();
        for (i = 1; i <= n; i++) {
            HashSet<String> set = new HashSet<>();
            for (j = 0; j <= n - i; j++)
                set.add(line.substring(j, j + i));
            if (set.size() < Math.pow(4, i)) {
                System.out.println(i);
                return;
            }
        }
    }
}
