package Paiza;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/11/4/004 21:35
 * @Description:
 */
public class C070 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line;
        char[] arr;
        while (sc.hasNextLine()) {
            line=sc.nextLine();
            if (line.length() != 4)
                continue;
            arr = line.toCharArray();
            int count = 0;
            if (arr[0] == arr[1])
                count++;
            if (arr[1] == arr[2])
                count++;
            if (arr[2] == arr[3])
                count++;
            if (count == 3)
                System.out.println("Four Card");
            else if (count == 2) {
                if (arr[1] == arr[2])
                    System.out.println("Three Card");
                else
                    System.out.println("Two Pair");
            } else if (count == 1)
                System.out.println("One Pair");
            else System.out.println("No Pair");
        }
    }
}

