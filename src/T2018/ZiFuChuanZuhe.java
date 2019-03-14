package T2018;

import java.util.Scanner;
import java.util.TreeSet;

public class ZiFuChuanZuhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        int n = line.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            TreeSet<String> treeSet = new TreeSet<>();
            for (int j = 0; j < n - i + 1; j++) {
                treeSet.add(line.substring(j, j + i));
            }
            for (String s : treeSet
            ) {
                sb.append(s).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
