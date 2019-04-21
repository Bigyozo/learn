package T2018;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/21/021 12:55
 * @Description:输入两个字符串a和b，字符串内容为二进制数字，
 * 求两个字符串相加的结果，加法计算方法以二进制方式计算，并返回对应的字符串结果。
 */
public class ZiFuChuanJiaFa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] strs=sc.nextLine().split(" ");
        int a=Integer.parseInt(strs[0],2);
        int b=Integer.parseInt(strs[1],2);
        a+=b;
        System.out.println(Integer.toString(a,2));
    }
}
