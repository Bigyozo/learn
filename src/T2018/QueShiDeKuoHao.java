package T2018;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-07 16:31
 * @Description: ${Description}
 */
public class QueShiDeKuoHao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        Stack<Character> stack=new Stack<>();
        char[] chars=line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else
                    stack.push(chars[i]);
            }
        }
        System.out.println(stack.size());
    }
}
