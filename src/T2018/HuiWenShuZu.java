package T2018;

import java.util.LinkedList;
import java.util.Scanner;

public class HuiWenShuZu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

    }
}
