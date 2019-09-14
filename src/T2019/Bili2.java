package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/9/10/010 19:34
 * @Description:
 */
public class Bili2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        int i=1,j=i+1,cur=i+j;
        while (j<n){
            if (cur<n){
                j++;
                cur+=j;
            }else if (cur==n){
                res++;
                i++;
                cur=getCur(i,j);
            }else {
                i++;
                cur=getCur(i,j);
            }
        }
        System.out.println(res+1);
    }

    private static int getCur(int i, int j) {
        return (j-i+1)*(i+j)/2;
    }
}
