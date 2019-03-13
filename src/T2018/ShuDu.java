package T2018;

import java.util.Scanner;

public class ShuDu {
    int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        ShuDu shuDu = new ShuDu(arr);
        shuDu.put(0, 0);
    }

    private void put(int i, int j) {
        if (i == 8 && j == 9) {
            printAll();
            return;
        }
        if (j == 9) {
            i++;
            j = 0;
        }
        if (arr[i][j] == 0) {
            for (int k = 1; k <= 9; k++) {
                if (enable(i, j, k)) {
                    arr[i][j] = k;
                    put(i, j + 1);
                } else {
                    arr[i][j] = 0;
                }
            }
        } else {
            put(i, j + 1);
        }
    }

    private boolean enable(int row, int col, int k) {
        for (int i = 0; i <= 8; i++) {
            if (arr[row][i] == k || arr[i][col] == k)
                return false;
        }
        int erow = row / 3 * 3, ecol = col / 3 * 3;
        for (int i = erow; i < erow + 3; i++) {
            for (int j = ecol; j < ecol + 3; j++) {
                if (arr[i][j] == k)
                    return false;
            }
        }
        return true;
    }

    private void printAll() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j != 8)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.println(arr[i][j]);
            }
        }
    }

    public ShuDu(int[][] arr) {
        this.arr = arr;
    }
}
