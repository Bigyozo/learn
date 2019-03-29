package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-27 18:46
 * @Description: ${Description}
 */
public class Test327 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String line=sc.nextLine();
        for (int i = 0; i < n; i++) {
            int k=9*i;
            char c=line.charAt(k);
            String str=line.substring(k+1,k+9);
            StringBuilder sb=new StringBuilder(str);
            if (c=='0')
                System.out.print(sb.reverse()+" ");
            else
                System.out.print(sb+" ");
        }
    }
}
