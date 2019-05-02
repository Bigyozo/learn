package T2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/2/002 13:52
 * @Description:给定两个-100到100的整数x和y,对x只能进行加1，减1，乘2操作，问最少对x进行几次操作能得到y？
 */
public class BFSbianhua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = in.next();
            String[] a = s.split(",");
            System.out.println(cishu(Integer.parseInt(a[0]), Integer.parseInt(a[1])));
        }
    }

    static int cishu(int a, int b) {
        if (a == b) return 0;
        List<bian> list = new ArrayList<>();
        list.add(new bian(a, 0));
        while (!list.isEmpty()) {
            bian tem = list.remove(0);
            if (tem.num == b) return tem.ceng;
            else if (tem.num < -100 || tem.num > 100) continue;
            list.add(new bian(tem.num + 1, tem.ceng + 1));
            list.add(new bian(tem.num - 1, tem.ceng + 1));
            list.add(new bian(tem.num * 2, tem.ceng + 1));
        }
        return -1;
    }

    static class bian {
        int num;
        int ceng;

        public bian(int num, int ceng) {
            this.num = num;
            this.ceng = ceng;
        }
    }
}
