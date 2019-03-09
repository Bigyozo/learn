package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-09 13:04
 * @Description: ${Description}
 */
public class NaiNiuBianHao {
    public static void main(String[] args) {
        final int MOD=1000000007;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        long res=1;
        for (int i = 0; i < n; i++) {
            res*=(arr[i]-i);
        }
        System.out.println(res%MOD);
    }
}
