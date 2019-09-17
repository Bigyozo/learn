package zfl;

import java.util.ArrayList;

public class BFMatch {
    public static int bfMatch(String target, String pattern) {
        int pos = -1;
        int i = 0, j = 0, k = 0;
        while (-1 == pos && i < target.length()) {
            while (j < pattern.length() && target.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                pos = k;
            } else {
                k++;
                i = k;
                j = 0;
            }
        }
        return pos;
    }

}
