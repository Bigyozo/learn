package T2019;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/5/11/011 17:21
 * @Description:实现一个HTML语法检查器。HTML语法规则简化如下：标签必须闭合，可以由开始和结束两个标签闭合，如<div></div>，也可以自闭合， 如<div       />
 */
public class HtmlCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        if(arr.length<2) {
            System.out.println(1);
            return;
        }
        boolean flag=false;
        Stack<String> stack = new Stack<>();
        StringBuilder tag = new StringBuilder();
        StringBuilder name = new StringBuilder();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '<') {
                if (flag){
                    System.out.println(1);
                    break;
                }
                flag=true;
                continue;
            }
            if (arr[i] == '>') {
                if (!flag){
                    System.out.println(1);
                    break;
                }
                if (!stack.isEmpty() && stack.peek().equals(tag.toString().substring(1))) {
                    stack.pop();
                } else {
                    if (tag.charAt(tag.length()-1)!='/')
                    stack.push(tag.toString());
                }
                count=0;
                flag=false;
                tag=new StringBuilder();
                name=new StringBuilder();
                continue;
            }
            if (count == 0 && arr[i] != ' ') {
                tag.append(arr[i]);
            } else if (count == 0 && arr[i] == ' ') {
                count++;
            } else if (count>0 && arr[i] != ' ') {
                name.append(arr[i]);
            }else if (count>0 && arr[i] == ' '){
                count++;
                if (!checName(name.toString())){
                    System.out.println(1);
                    break;
                }
                name=new StringBuilder();
            }
        }
        if (!stack.isEmpty()||flag){
            System.out.println(1);
        }else
            System.out.println(0);
    }

    private static boolean checName(String name) {
        return name.matches("a-z+=\"a-z+\"");
    }
}
