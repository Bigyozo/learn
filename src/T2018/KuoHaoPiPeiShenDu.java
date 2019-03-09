package T2018;

import java.util.Scanner;
        import java.util.Stack;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-03-09 11:45
 * @Description: ${Description}
 */
public class KuoHaoPiPeiShenDu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.next();
        Stack<Character> stack=new Stack<>();
        char[] chars=line.toCharArray();
        int max=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
                if(max<stack.size())
                    max=stack.size();
            } else if (chars[i] == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else
                    stack.push(chars[i]);
            }
        }
        System.out.println(max);
    }
}
