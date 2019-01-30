package zfl;

import java.util.Arrays;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-22 14:46
 * @Description: ${Description}
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.trim().equals(""))
            return 0;
        char[] chars = str.toCharArray();
        boolean isPos=true;
        int startNum=0,out=0;
        if (chars[0] == '-') {
            isPos = false;
            startNum = 1;
        }
        else if (chars[0] == '+')
            startNum =1;
        for(int i=startNum;i<chars.length;i++){
            if (!(chars[i]>='0'&&chars[i]<='9'))
                return 0;
        }
        for(int i=startNum;i<chars.length;i++){
            out=out*10+(int)(chars[i]-'0');
        }
        if(isPos==false)
        return -out;
        else return out;
    }

    public static void main(String[] args) {
        StrToInt strToInt=new StrToInt();
        int i=strToInt.StrToInt("62345");
        System.out.println(i);
    }
}
