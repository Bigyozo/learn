package T2019;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"27", "20", "202", "18", "158", "97", "563", "204", "2"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String var1 = o1 + o2;
                String var2 = o2 + o1;
                return var2.compareTo(var1);
            }
        });
        Arrays.stream(arr).forEach(o -> System.out.print(o + " "));

    }
}
