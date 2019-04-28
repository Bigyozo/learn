package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/28/028 16:40
 * @Description:
 */
public class IsErChaSouSuoShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strs = line.split(",");
        int n = strs.length;
        int[] arr = new int[n];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("None")) {
                arr[i] = -1;
            } else
                arr[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] == -1)
                continue;
            if (arr[2 * i + 1] != -1 && arr[i] < arr[2 * i + 1]) {
                System.out.println("False");
                return;
            }
            if (arr[2 * i + 2] != -1 && arr[i] > arr[2 * i + 2]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
