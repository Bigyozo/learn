package T2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZiFuChuanJuli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char c = sc.nextLine().toCharArray()[0];
        char[] arr = line.toCharArray();
        int[] res = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                res[i] = -1;
                list.add(i);
            }
        }
        for (int i:list
             ) {
            int t=i-1;
            int count=1;
            while (t>=0&&res[t]!=-1){
                if (res[t]==0||res[t]>count)
                res[t]=count;
                count++;
                t--;
            }
            t=i+1;
            count=1;
            while (t<res.length&&res[t]!=-1){
                if (res[t]==0||res[t]>count)
                    res[t]=count;
                count++;
                t++;
            }
        }
        for (int i:list
             ) {
            res[i]=0;
        }
        String out=Arrays.stream(res).mapToObj(i->Integer.toString(i)).collect(Collectors.joining(","));
        System.out.println("["+out+"]");
    }
}
