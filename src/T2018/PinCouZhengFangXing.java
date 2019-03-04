package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-04 15:50
 * @Description: ${Description}
 */
public class PinCouZhengFangXing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[3]-arr[0]+arr[2]-arr[1]);
    }
}
