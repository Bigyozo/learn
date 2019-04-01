package T2018;


import java.util.Scanner;

public class PaiZhaoDuXing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line=sc.nextLine();
        char[] arr=line.toCharArray();
        int p=0;
        int k = (n - 1) / 3;
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < k-i; j++) {
                System.out.print(" ");
            }
            System.out.print(arr[p++]);
            for (int j = 0; j < 2*(i-1)+1; j++) {
                System.out.print(" ");
            }
            System.out.println(arr[p++]);
        }
        for (int i = 0; i < k+1; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            System.out.println(arr[p++]);
        }
    }
}
