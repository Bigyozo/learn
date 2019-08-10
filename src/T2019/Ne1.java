package T2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-08-03 14:01
 * @Description: ${Description}
 */
public class Ne1 {
    static class Node implements Comparable<Node>{
        int num;
        int value;

        @Override
        public int compareTo(Node o) {
            return o.value-this.value;
        }

        public Node(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node[] arr=new Node[n];
        for (int i = 0; i < n; i++) {
          arr[i]=new Node(i,sc.nextInt());
        }
        Arrays.sort(arr);
        double value[]=new double[n];
        for (int i = 0; i < n; i++) {
            value[arr[i].num]=(n-1.0-i)/n*100;
        }
        int q=sc.nextInt();
        int arrq[]=new int[q];
        for (int i = 0; i < q; i++) {
            arrq[i]=sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            System.out.printf("%.6f",value[arrq[i]-1]);
            System.out.println();
        }
    }
}
