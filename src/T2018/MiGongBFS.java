package T2018;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-23 13:47
 * @Description: ${Description}
 */
public class MiGongBFS {
    static class Node {
        int x;
        int y;
        int key;
        int step;

        public Node(int x, int y, int key, int step) {
            this.x = x;
            this.y = y;
            this.key = key;
            this.step = step;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[m][n];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '2') {
                    int out = getPath(arr, i, j, m, n);
                    System.out.println(out);
                    break;
                }
            }
        }

    }

    private static int getPath(char[][] arr, int i, int j, int row, int col) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(i, j, 0, 0));
        boolean[][][] history = new boolean[row][col][1025];
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            int key = cur.key;
            if (x < 0 || x >= row || y < 0 || y >= col || arr[x][y] == '0')
                continue;
            char c = arr[x][y];
            if (c >= 'A' && c <= 'Z') {
                int offset = c - 'A';
                if ((key >> offset & 1) == 0)
                    continue;
            }
            if (c >= 'a' && c <= 'z') {
                int offset = c - 'a';
                key = key | 1 << offset;
            }
            if (history[x][y][key] == true)
                continue;
            if (c == '3')
                return cur.step;
            history[x][y][key] = true;
            queue.offer(new Node(x - 1, y, key, cur.step + 1));
            queue.offer(new Node(x + 1, y, key, cur.step + 1));
            queue.offer(new Node(x, y - 1, key, cur.step + 1));
            queue.offer(new Node(x, y + 1, key, cur.step + 1));
        }
        return -1;
    }
}
