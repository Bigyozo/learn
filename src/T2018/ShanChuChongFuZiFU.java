package T2018;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ShanChuChongFuZiFU {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        LinkedHashSet<Character> hashSet=new LinkedHashSet<>();
        char[] chars=line.toCharArray();
        for (char c:
             chars) {
            hashSet.add(c);
        }
        StringBuilder sb=new StringBuilder();
        Iterator<Character> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        System.out.println(sb.toString());
    }
}
