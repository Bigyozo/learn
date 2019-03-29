package T2018;

import java.util.*;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-27 19:53
 * @Description: ${Description}
 */
public class QieShuiGuo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Double>xset=new HashSet<>();
        HashSet<Double>yset=new HashSet<>();
        HashSet<Double>zset=new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            if (xset.contains(a)||yset.contains(b)||zset.contains(b/a))
                continue;
            count++;
            xset.add(a);
            yset.add(b);
            zset.add(b/a);
        }
        System.out.println(count);
    }

}
