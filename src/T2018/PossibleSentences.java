package T2018;

import java.util.*;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-29 16:39
 * @Description: ${Description}
 */
public class PossibleSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s = line.substring(4, line.length() - 1);
        line = sc.nextLine();
        line = line.substring(6);
        String[] dict = line.split(",");
        for (int i = 0; i < dict.length; i++) {
            dict[i] = dict[i].substring(1, dict[i].length() - 1);
        }
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < dict.length; i++) {
            StringBuilder sb = new StringBuilder();
            String s2=s;
            for (int j = i; j < dict.length; j++) {
                if (s2.startsWith(dict[j])) {
                    sb.append(dict[j]+" ");
                    if (s2.length() > dict.length)
                        s2 = s2.substring(dict[j].length());
                    else
                        break;
                }
            }
            if (sb.length() > 0)
                list.add(sb.toString().substring(0,sb.length()-1));
        }
        String res="[";
        Collections.sort(list,Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1)
            res+=list.get(i)+", ";
            else
                res+=list.get(i)+"]";
        }
        System.out.println(res);
    }
}
