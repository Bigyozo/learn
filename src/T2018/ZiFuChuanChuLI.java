package T2018;

import java.util.HashMap;
import java.util.Scanner;

public class ZiFuChuanChuLI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        char[] arr=line.toCharArray();
        for (char c:arr
             ) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else
                map.put(c,1);
        }
        char max=' ';
        int count=0;
        for (char c:map.keySet()
             ) {
            int temp=map.get(c);
            if (temp>count){
                max=c;
                count=temp;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(max);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max)
                sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
