package Paiza;

import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/12/2/002 15:37
 * @Description:ビームの反射
 */
public class A009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int[][] arr=new int[h][w];
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            char[] chars=sc.nextLine().toCharArray();
            for (int j = 0; j < w; j++) {
                if(chars[j]=='\\')
                    arr[i][j]=1;
                else if (chars[j]=='/')
                    arr[i][j]=2;
            }
        }
        int res=helper(arr,0,0,1);
        System.out.println(res);
    }

    private static int helper(int[][] arr, int x, int y, int k) {
        if (x<0||x>=arr.length||y<0||y>=arr[0].length)
            return 0;
        if (arr[x][y]==0){
            return decide(arr,x,y,k);
        }
        else if (arr[x][y]==1){
            if (k==1||k==3)
                k++;
            else k--;
            return decide(arr,x,y,k);
        }
        else {
            if (k==1)
                k=4;
            else if (k==2)
                k=3;
            else if (k==3)
                k=2;
            else k=1;
            return decide(arr,x,y,k);
        }
    }

    private static int decide(int[][] arr, int x, int y, int k){
        if (k==1)
            return 1+helper(arr,x,y+1,k);
        else if (k==2)
            return 1+helper(arr,x+1,y,k);
        else if (k==3)
            return 1+helper(arr,x,y-1,k);
        else
            return 1+helper(arr,x-1,y,k);
    }
}
