package T2018;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ZhaoZhongShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.substring(1, line.length() - 1);
        int[] arr = Arrays.stream(line.split(",")).mapToInt(s -> Integer.parseInt(s)).toArray();
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp=0;
            if (map.containsKey(arr[i])) {
                temp = map.get(arr[i]);
                map.put(arr[i],temp+1);
            }
            else {
                map.put(arr[i],1);
            }
            if (temp+1 > n / 2){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
