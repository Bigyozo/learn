package T2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-25 15:59
 * @Description: ${Description}
 */
public class DengChaShuLie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.nextLine();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
            arr[i]=scanner.nextInt();
        if(isDengCha2(arr))
            System.out.println("Possible");
        else
            System.out.println("impossible");
    }
    //复杂度nlogn
    private static boolean isDengCha(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=1)
            return false;
        int len=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            int cur=arr[i+1]-arr[i];
            if (cur!=len)
                return false;
        }
        return true;
    }
    //复杂度2n
    private static boolean isDengCha2(int[] arr){
        int min=arr[0],max=arr[0];
        int n= arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        if((max-min)%(n-1)!=0)
            return false;
        int def=(max-min)/(n-1);
        for(int i=0;i<n;i++){
            if((arr[i]-min)%def!=0)
                return false;
        }
        return true;
    }
}
