package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-04 14:39
 * @Description: ${Description}
 */
public class PaiXu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] newArr = arr.clone();
        Arrays.sort(newArr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != newArr[i])
                count++;
        }
        System.out.println(count);
    }
}
