package T2018;


import java.util.ArrayList;

import java.util.Scanner;

public class BianChengTi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String line = scanner.next();
        char[] chars = line.toCharArray();
        int b = helper(m, chars, 'b');
        int a = helper(m, chars, 'a');
        System.out.println(Math.max(a, b));
    }

    private static int helper(int m, char[] chars, char c) {
        ArrayList<Integer> bl = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                bl.add(i);
        }
        int max = 0;
        if (chars[0] != c && m < bl.size()) {
            max = bl.get(m);
        }
        for (int i = 0; i < bl.size() - m - 1; i++) {
            int t = bl.get(i + m + 1) - bl.get(i) - 1;
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
