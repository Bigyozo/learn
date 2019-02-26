package T2018;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-26 16:14
 * @Description: ${Description}
 */
public class DuiQiZi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            x[i] = scanner.nextInt();
        }
        int[] y = new int[num];
        for (int i = 0; i < num; i++) {
            y[i] = scanner.nextInt();
        }
        int[] d = getDist(num, x, y);
        StringBuilder sb=new StringBuilder();
        for (int res: d) {
            sb.append(res+" ");
        }
        System.out.println(sb.toString().trim());
    }

    private static int[] getDist(int n, int[] x, int[] y) {
        int[] dist=new int[n];
        for (int i = 0; i < n; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    pq.add(Math.abs(x[k]-x[i])+Math.abs(y[k]-y[j]));
                }
                int res=0;
                int sum=0;
                while (!pq.isEmpty()){
                    sum+=pq.poll();
                    dist[res]=Math.min(sum,dist[res]);
                    res++;
                }
            }
        }
        return dist;
        }
}
