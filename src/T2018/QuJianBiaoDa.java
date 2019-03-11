package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-05 15:44
 * @Description: ${Description}
 */
public class QuJianBiaoDa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=1;
        int old=scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num=scanner.nextInt();
            if(num!=old+1)
                count++;
            old=num;
        }
        System.out.println(count);
    }
}
