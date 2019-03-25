package T2018;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-25 15:32
 * @Description: ${Description}
 */
public class DuiChengZiChuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        TreeSet<String> set=new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (int i=0;i<line.length();i++){
            for (int j = i+1; j <=line.length() ; j++) {
                String str=line.substring(i,j);
                if (isDuiCheng(str))
                    set.add(str);
            }
        }
        System.out.println(set.last());
    }

    private static boolean isDuiCheng(String str) {
        if (str.length()<1)
            return false;
        if (str.length()==1)
            return true;
        char[] chars=str.toCharArray();
        for (int i = 0,j=str.length()-1; i < j; i++,j--) {
            if (chars[i]!=chars[j])
                return false;
        }
        return true;
    }
}
