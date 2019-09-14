package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/9/10/010 18:53
 * @Description:
 */
public class Bili1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().toCharArray();
        char[] s2 = sc.nextLine().toCharArray();
        int n = s1.length - s2.length;
        int res=0;
        for (int i = 0, j = 0; i < s1.length && j < s2.length; ) {
            if (s1[i] == s2[j]) {
                i++;
                j++;
            }
            else if (n>0){
                i++;
                res++;
                n--;
            }
            else if (n<0){
                j++;
                res++;
                n++;
            }else{
                i++;
                j++;
                res++;
            }
        }
        System.out.println(res+Math.abs(n));
    }
}
