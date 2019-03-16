package T2018;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-16 14:48
 * @Description: ${Description}
 */
public class Kolakoski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int p=arr[0],q=0;
        while (list.size()<=n) {
            for (int i = 0; i < m; i++) {
                for (int j = 1; j <= p; j++) {
                    list.add(arr[i]);
                }
                p=list.get(++q);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
