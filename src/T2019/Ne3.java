package T2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-08-03 16:19
 * @Description: ${Description}
 */
public class Ne3 {
    static class Node implements Comparable<Node>{
        int value;

        @Override
        public int compareTo(Node o) {
            if ((o.value+this.value)%2==1)
            return new Integer(this.value).toString().compareTo(new Integer(o.value).toString());
            else return 0;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node[] arr=new Node[n];
        for (int i = 0; i < n; i++) {
            arr[i]=new Node(sc.nextInt());
        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i].value+" ");
        }
        System.out.println(sb.toString());
    }
}
