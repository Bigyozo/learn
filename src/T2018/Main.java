package T2018;

import java.util.Scanner;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-02-22 16:43
 * @Description: ${Description}
 */
public class Main {
    int min=0;
    boolean[] kset=new boolean[26];
    char[][] arr;
    boolean[][] history;
    int row,col;
    int s[][]=new int[10][2];
    int si=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[m][n];
        boolean[][] history=new boolean[m][n];
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
        Main Main=new Main(arr,history);
        Main.findPath(b1,b2,0);
        System.out.println(Main.min);
    }

    private void findPath(int i, int j,int count) {
        if (i < 0 || i >= row || j < 0 || j >= col||arr[i][j]=='0'||history[i][j]==true)
            return;
        if(arr[i][j]>='A'&&arr[i][j]<='Z') {
            int offset = arr[i][j] - 'A';
            if (kset[offset] == false)
                return;
        }
        if(arr[i][j]>='a'&&arr[i][j]<='z'){
            int offset=arr[i][j]-'a';
            kset[offset]=true;
            s[si][0]=i;
            s[si][1]=j;
            history=new boolean[row][col];
            for(int k=0;k<=si;k++)
                history[s[k][0]][s[k][1]]=true;
            si++;
        }
        if(arr[i][j]=='3'){
            if(min==0)
                min=count;
            else if(count<min)
                min=count;
            return;
        }
        count++;
        history[i][j]=true;
        findPath(i-1,j,count);
        findPath(i+1,j,count);
        findPath(i,j-1,count);
        findPath(i,j+1,count);
    }

    public Main(char[][] arr,boolean[][] history) {
        this.arr = arr;
        this.row=arr.length;
        this.col=arr[0].length;
        this.history=history;
    }
}
