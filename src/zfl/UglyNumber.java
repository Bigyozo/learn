package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-04 15:09
 * @Description: 求丑数
 */
public class UglyNumber {
    public static int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        int[] arr = new int[index];
        int t2 = 0, t3 = 0, t5 = 0;
        arr[0] = 1;
        for (int i = 1; i < index; i++) {
            int min = Math.min(arr[t2]*2, Math.min(arr[t3]*3, arr[t5]*5));
            arr[i] = min;
            if (min == arr[t2] * 2) t2++;
            if (min == arr[t3] * 3) t3++;
            if (min == arr[t5] * 5) t5++;
        }
        return arr[index - 1];
    }

    public static void main(String[] args) {
        int i=UglyNumber.GetUglyNumber_Solution(8);
        System.out.println(i);
    }
}