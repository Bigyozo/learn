package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-29 12:06
 * @Description: 找出字符流中第一个只出现一次的字符
 */
public class FirstAppearChar {
    int[] myHash = new int[256];
    StringBuilder sb = new StringBuilder();

    //Insert one char from stringstream
    public void Insert(char ch) {
        sb.append(ch);
        myHash[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char[] chars=sb.toString().toCharArray();
        for(char c:chars){
            if(myHash[c]==1)
                return c;
        }
        return '#';
    }

    public static void main(String[] args) {

    }
}
