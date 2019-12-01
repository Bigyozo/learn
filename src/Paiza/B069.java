package Paiza;

import java.util.Scanner;


/**
 * @Auther: zhangfanglong
 * @Date: 2019/12/1/001 19:01
 * @Description:蟻の餌探し
 */
public class B069 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] arr = new int[H + 1][W + 1];
        sc.nextLine();
        for (int i = 1; i <= H; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '#')
                    arr[i][j + 1] = 1;
            }
        }
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (arr[x][y] == 1)
                arr[x][y] = 2;
            else {
                System.out.println("NO");
                return;
            }
        }
        int res = helper(arr, 1, 1);
        if (res==N)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static int helper(int[][] arr, int x, int y) {
        if (x <= 0 || x >= arr.length || y <= 0 || y >= arr[0].length || arr[x][y] == 0)
            return 0;
        else if (arr[x][y] == 1) {
            arr[x][y] = 0;
            return helper(arr, x - 1, y) + helper(arr, x, y - 1) + helper(arr, x + 1, y) + helper(arr, x, y + 1);
        } else if (arr[x][y] == 2) {
            arr[x][y] = 0;
            return 1 + helper(arr, x - 1, y) + helper(arr, x, y - 1) + helper(arr, x + 1, y) + helper(arr, x, y + 1);
        }
        return 0;
    }
}
