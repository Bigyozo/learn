package T2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/8/18/018 10:10
 * @Description:
 */
public class StrPipei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char[] sub = sc.nextLine().toCharArray();
        ArrayList<Integer> list=new ArrayList<>();
            int cur = 0;
            int j = 0, k = 0;
            for (; k < sub.length && j < str.length; ) {
                if (str[j] == sub[k]) {
                    j++;
                    k++;
                    cur++;
                } else if (sub[k] == '?') {
                    k++;
                    j++;
                    int count=1;
                    for (;count<=3;count++){
                        if (str[j]==sub[k]) {
                            cur+=count;
                            break;
                        }
                        j++;
                    }
                } else {
                    break;
                }
            }
            if(k==sub.length)
                list.add(cur);

        if (list.size()==0)
            System.out.println(-1);
        else {
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}
