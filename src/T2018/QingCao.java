package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-06 17:32
 * @Description: ${Description}
 */
public class QingCao {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            if(t%5==0||t%5==2)
                System.out.println("yang");
            else
                System.out.println("niu");
        }
    }
}
