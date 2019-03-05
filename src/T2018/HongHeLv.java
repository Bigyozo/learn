package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-05 16:50
 * @Description: ${Description}
 */
public class HongHeLv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        char[] chars = line.toCharArray();
        int max=Integer.MIN_VALUE,maxp=-1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='G')
                continue;
            int nr1=0,nr2=0;
            for (int j = 0; j < chars.length; j++) {
                if (j<=i&&chars[j]=='R')
                   nr1++;
                else if(j>i&&chars[j]=='R')
                    nr2++;
            }
            if(nr1-nr2>max){
                max=nr1-nr2;
                maxp=i;
            }
        }
        int count=0;
        for (int i=0;i<chars.length;i++){
            if(i<=maxp&&chars[i]=='G')
                count++;
            else if (i>maxp&&chars[i]=='R')
                count++;
        }
        System.out.println(count);
    }
}
