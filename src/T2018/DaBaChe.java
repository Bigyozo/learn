package T2018;

import java.util.Scanner;

public class DaBaChe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = (n + m - 1) / m;
        int[][] arr = new int[k][m];
        int count = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m && count < n; j++) {
                count++;
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = k-1; i >=0 ; i--) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]!=0)
                    System.out.print(arr[i][j]+" ");
            }
        }
    }
}
