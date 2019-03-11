package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-06 17:00
 * @Description: ${Description}
 */
public class PinCouSanJiaoXing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        if(arr[2]>=arr[0]+arr[1])
            arr[2]=arr[0]+arr[1]-1;
        System.out.println(Arrays.stream(arr).sum());

    }
}
