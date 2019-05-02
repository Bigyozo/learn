package T2019;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/2/002 15:23
 * @Description:给定两个字符串，已知可以使用三种方式进行变换
 * 1. 插入一个字符
 * 2. 删除一个字符
 * 3. 更改一个字符
 * 请设计一个算法，找到两个字符串之间的经历几次最小变换，可以字符串1转换成字符串2
 */
public class StrChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(getNum(s1,s2));
        sc.close();
    }

    public static int getNum(String s1,String s2) {
        int len1 =s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++) {
            dp[i][0] = i;
        }
        for(int j=0;j<=len2;j++ ) {
            dp[0][j] = j;
        }
        for(int i=1;i<=len1;i++) {
            for(int j=1;j<=len2;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] =1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[len1][len2];
    }
}
