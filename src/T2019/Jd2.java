package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/8/24/024 20:45
 * @Description:
 */
public class Jd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int res=1;
        for (int i = 1; i < n; i++) {
            if (arr[i]>=max){
                max=arr[i];
                res++;
            }
            else
                continue;
        }
        System.out.println(res);
    }
}
