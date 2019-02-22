package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-22 16:43
 * @Description: ${Description}
 */
public class MiGong {
    int count=0,min=0;
    boolean[] kset=new boolean[26];
    char[][] arr;
    int row,col;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char[][] arr = new char[m][n];
        int b1 = 0, b2 = 0;
        for (int i = 0; i < m; i++) {
            char[] chars = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                if (chars[j] == '2') {
                    b1 = i;
                    b2 = j;
                }
                arr[i][j] = chars[j];
            }
        }
        MiGong miGong=new MiGong(arr);
        miGong.findPath(b1,b2);
        System.out.println(miGong.count);
    }

    private void findPath(int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col||arr[i][j]=='0')
            return;
        if(arr[i][j]>='A'&&arr[i][j]<='Z') {
            int offset = arr[i][j] - 'A';
            if (kset[offset] == false)
                return;
        }
        if(arr[i][j]>='a'&&arr[i][j]<='z'){
            int offset=arr[i][j]-'a';
            kset[offset]=true;
        }
        if(arr[i][j]=='3'){
            if(min==0)
                min=count;
            else if(count<min)
                min=count;
        }
        count++;
    }

    public MiGong(char[][] arr) {
        this.arr = arr;
        this.row=arr.length;
        this.col=arr[0].length;
    }
}
