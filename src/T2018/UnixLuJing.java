package T2018;


import java.util.LinkedList;
import java.util.Scanner;


public class UnixLuJing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strings = line.split("/");
        LinkedList<String> list = new LinkedList<>();
        for (String str : strings
        ) {
            if (".".equals(str) || "".equals(str))
                continue;
            if ("..".equals(str))
                list.removeLast();
            else
                list.add(str);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list
        ) {
            sb.append("/" + str);
        }
        System.out.println(sb.toString());
    }
}
