package T2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/9/16/016 21:47
 * @Description:
 */
public class Tested {
    static void method(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int tmp=arr[i],t=-1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>tmp){
                    tmp=arr[j];
                    t=j;
                }

            }
            if(t!=-1) {
                arr[t] = arr[i];
                arr[i] = tmp;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        Integer[] b=list.toArray(new Integer[1]);
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,2,6};
        method(arr);
//        Arrays.stream(arr).forEach(System.out::print);
    }
}
