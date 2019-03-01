package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-01 15:45
 * @Description: ${Description}
 */
public class XunHuanShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strs = line.split(" ");
        StringBuffer sb1 = new StringBuffer(strs[0]);
        StringBuffer sb2 = new StringBuffer(strs[2]);
        for (int i = 1; i < Integer.parseInt(strs[1]); i++) {
            sb1.append(strs[0]);
        }
        for (int i = 1; i < Integer.parseInt(strs[3]); i++) {
            sb2.append(strs[2]);
        }
        int l1 = sb1.toString().length();
        int l2 = sb2.toString().length();
        if (l1 > l2)
            System.out.println("Great");
        else if (l1 < l2)
            System.out.println("Less");
        else {
            int r = sb1.toString().compareTo(sb2.toString());
            if (r > 0)
                System.out.println("Great");
            else if (r == 0)
                System.out.println("Equal");
            else
                System.out.println("Less");
        }
    }
}
