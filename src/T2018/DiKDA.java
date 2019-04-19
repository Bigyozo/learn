package T2018;

import java.util.Arrays;
import java.util.Scanner;

public class DiKDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.substring(1, line.length() - 1);
        int[] arr = Arrays.stream(line.split(",")).mapToInt(s -> Integer.parseInt(s)).toArray();
        int n = arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=max1,max3=max1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if (arr[i]>=max2){
                max3=max2;
                max2=arr[i];
            }else if (arr[i]>=max3){
                max3=arr[i];
            }
        }
        System.out.println(max3);
    }
}
