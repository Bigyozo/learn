package zfl;

import java.util.ArrayList;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-09 15:55
 * @Description: 一整型数组里除了两个数字之外，其他的数字都出现了偶数次,找出这两个只出现一次的数字
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int temp=0,div=1;
        //利用偶数个数异或为零，得到两个一次的数的异或
        for(int i:array){
            temp=temp^i;
        }
        //找异或值的最高位，用以分组
        while(temp!=0){
            temp=temp>>1;
            div=div<<1;
        }
        div=div>>1;
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        for(int i:array){
            if((i&div)==0)
                li1.add(i);
            else
                li2.add(i);
        }
        temp=0;
        for(int a:li1){
            temp=temp^a;
        }
        num1[0]=temp;
        temp=0;
        for(int b:li2){
            temp=temp^b;
        }
        num2[0]=temp;
    }
}
