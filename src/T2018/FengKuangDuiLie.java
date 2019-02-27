package T2018;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-27 15:27
 * @Description: ${Description}
 */
public class FengKuangDuiLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int value = getCrazyValue(arr, n);
        System.out.println(value);
    }

    private static int getCrazyValue(int[] arr, int n) {
        int value = 0;
        Arrays.sort(arr);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[n - 1]);
        int min = 0, max = n - 2;
        boolean addmin = true;
        while (min < max - 1) {
            if (addmin) {
                list.addFirst(arr[min++]);
                list.addLast(arr[min++]);
                addmin = false;
            } else {
                list.addFirst(arr[max--]);
                list.addLast(arr[max--]);
                addmin = true;
            }
        }
        if (min < max)
            list.addFirst(arr[min]);
        if (Math.abs(arr[max] - list.peekFirst()) >= Math.abs(arr[max] - list.peekLast()))
            list.addFirst(arr[max]);
        else
            list.addLast(arr[max]);
        for (int i = 0; i < n - 1; i++) {
            value += Math.abs(list.get(i + 1) - list.get(i));
        }
        return value;
    }

}
