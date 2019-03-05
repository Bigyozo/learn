package T2018;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-05 15:56
 * @Description: ${Description}
 */
public class ShuZiYouXi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] nums = line.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            char[] chars = nums[i].toCharArray();
            Arrays.sort(chars);
            int temp = Integer.parseInt(new String(chars));
            if (temp > max)
                max = temp;
        }
        System.out.println(max);
    }
}
