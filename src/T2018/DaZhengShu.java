package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-22 15:02
 * @Description: 大整数相乘
 */
public class DaZhengShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String out = multiply(num1, num2);
        System.out.println(out);
    }

    private static String multiply(String num1, String num2) {
        int[] d = new int[num1.length() + num2.length()];
        num1=new StringBuilder(num1).reverse().toString();
        num2=new StringBuilder(num2).reverse().toString();
        for (int i = 0; i < num1.length(); i++) {
            int a = num1.charAt(i) - '0';
            for (int j = 0; j < num2.length(); j++) {
                int b = num2.charAt(j) - '0';
                d[i + j] += a * b;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d.length; i++) {
            int cur = d[i] % 10;
            int plus = d[i] / 10;
            sb.insert(0, cur);
            if (i < d.length - 1)
                d[i + 1] += plus;
        }
        while (sb.length() > 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.length() > 0 ? sb.toString() : "0";
    }
}
