package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/9/10/010 19:55
 * @Description:
 */
public class Bili3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] a1 = str.split(" ");
        String[] a2 = a1[2].split(a1[0]);
        char c=a1[1].charAt(0);
        for (int i=0;i<a2.length;i++) {
            a2[i]=a2[i].replace(c,' ');
            System.out.println(a2[i]);
        }
    }
}
