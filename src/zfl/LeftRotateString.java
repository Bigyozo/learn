package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-16 15:14
 * @Description: ${Description}
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.length()==0)
            return "";
        n=n%str.length();
        String s1=str.substring(0,n);
        String s2=str.substring(n);
        return s2+s1;
    }

    public static void main(String[] args) {
        String s="abcXYZdef";
        LeftRotateString leftRotateString=new LeftRotateString();
        String out=leftRotateString.LeftRotateString(s,3);
        System.out.println(out);
    }
}
