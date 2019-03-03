package T2018;

import java.util.Scanner;

public class HuiWenSuShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isHuiWen(i) && isSuShu(i))
                count++;
        }
        System.out.println(count);
    }

    private static boolean isSuShu(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isHuiWen(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        int len = chars.length;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (chars[i] != chars[j])
                return false;
        }
        return true;
    }
}
