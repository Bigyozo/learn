package T2018;

import java.util.Arrays;
import java.util.Scanner;


public class ShuZuYIDong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.substring(1, line.length() - 1);
        int[] arr = Arrays.stream(line.split(",")).mapToInt(s -> Integer.parseInt(s)).toArray();
        int p = 0;
        boolean[] booleans = new boolean[arr.length];
        while (p >= 0 && p < arr.length && booleans[p] == false) {
            booleans[p] = true;
            p += arr[p];
        }
        if (p < 0 || p >= arr.length)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
