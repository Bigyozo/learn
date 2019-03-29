package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-29 16:33
 * @Description: ${Description}
 */
public class FangGeZouFa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int res=helper(0,0,x,y);
        System.out.println(res);
    }

    private static int helper(int a, int b, int x, int y) {
        if(a>x||b>y)
            return 0;
        if (a==x&&b==y)
            return 1;
        return helper(a+1,b,x,y)+helper(a,b+1,x,y);
    }

}
