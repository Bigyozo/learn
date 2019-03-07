package T2018;


import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-07 15:45
 * @Description: TODO:需要复习
 */
public class XinYunZiXuLie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int res=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()&&arr[i]>=stack.peek()){
                res=Math.max(res,stack.pop() ^ arr[i]);
            }
            if(!stack.isEmpty())
                res=Math.max(res,stack.peek() ^ arr[i]);
            stack.push(arr[i]);
        }
        System.out.println(res);
    }
}
