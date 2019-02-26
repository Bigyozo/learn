package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-23 12:57
 * @Description: ${Description}
 */
public class CaiSeZhuanKuai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getNum(str));
    }
    //判断字符串中字符种类数
    static int getNum(String str) {
        char[] chars = str.toCharArray();
        int set = 0;//set按位记录各字符
        for (int i = 0; i < chars.length; i++) {
            int offset = chars[i] - 'A';
            set = set | (1 << offset);
        }
        int count = 0;
        while (set > 0) {
            count += set & 1;
            set = set >> 1;
        }
        if (count > 2)
            return 0;
        else if (count == 2)
            return 2;
        else
            return 1;
    }
}
