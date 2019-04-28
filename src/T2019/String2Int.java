package T2019;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/4/24/024 18:25
 * @Description:
 */

import java.util.Scanner;

public class String2Int {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int string2int(String str) {
        char[] arr = str.toCharArray();
        int st = 0;
        int m=0;
        while (st < arr.length) {
            if (arr[st] >= '1' && arr[st] <= '9')
                break;
            else if (arr[st] == '0' || arr[st] == '+') {
                st++;
            } else if (arr[st] == '-') {
                m++;
                st++;
            } else
                return 0;
        }
        int end = st;
        while (end < arr.length) {
            if (arr[end] == '.')
                break;
            end++;
        }
        end--;
        int res = 0;
        for (int count = 1; end >= st; end--) {
            if (arr[end]<'0'||arr[end]>'9')
                return 0;
            res += (arr[end] - '0') * count;
            count *= 10;
        }
        if (m%2==0)
            return res;
        else
            return -res;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = string2int(_str);
        System.out.println(String.valueOf(res));

    }
}