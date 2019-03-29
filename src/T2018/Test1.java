package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-26 14:57
 * @Description: ${Description}
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr={2,5,3,7,6,9,0,11,24,3};
        sort(arr,arr.length);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
    public static void swapWithZero(int[] array, int len, int n) {
       int t=array[0];
       array[0]=array[n];
       array[n]=t;
    }
    // 不要修改以上函数内容

    /**
     * 通过调用swapWithZero方法来排
     *
     * @param array
     *            存储有[0,n)的数组
     * @param len
     *            数组长度
     */
    public static void sort(int[] array, int len) {
        // 完成这个函数

        for(int i=0;i<len-1;i++){
            int max=array[0];
            int k=0;
            for(int j=1;j<len-i;j++){
                if(array[j]>max){
                    max=array[j];
                    k=j;
                }
            }
            swapWithZero(array,len,k);
            swapWithZero(array,len,len-i-1);
        }
    }
}

