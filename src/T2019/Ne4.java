package T2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-08-03 16:34
 * @Description: ${Description}
 */
public class Ne4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] qarr=new int[q];
        for (int i = 0; i < q; i++) {
            qarr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]<qarr[i]&&j<arr.length){
                    if(j==arr.length-1)
                        System.out.println(0);
                    continue;
                }
                else{
                    System.out.println(arr.length-j);
                    for (;j<arr.length;j++){
                        arr[j]--;
                    }
                }

            }
        }
    }
}
