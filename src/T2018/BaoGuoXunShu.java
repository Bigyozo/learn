package T2018;


import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-16 14:08
 * @Description: ${Description}
 */
public class BaoGuoXunShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] arr = new int[7];
            boolean flag=true;
            for (int i = 1; i <= 6; i++) {
                arr[i] = scanner.nextInt();
                if(arr[i]!=0)
                    flag=false;
            }
            if (flag)
                return;
            int res=0;
            res=arr[6]+arr[5]+arr[4]+(arr[3]+3)/4;
            int[] two_in_three={0,5,3,1};
            res+=Math.max(0,(arr[2]-arr[4]*5-two_in_three[arr[3]%4]+8)/9);
            res+=Math.max(0,(arr[1]-(res*36-arr[6]*36-arr[5]*25-arr[4]*16-arr[3]*9-arr[2]*4)+35)/36);
            System.out.println(res);
        }
    }
}
