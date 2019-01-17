package zfl;

/**
 * @Author: zhangfanglong
 * @CreateTime: 2019-01-16 16:09
 * @Description: 翻转字符串
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str.trim().length() <= 1) {
            return str;
        }
        String[] strings = str.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == 0)
                stringBuilder.append(strings[i]);
            else
                stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReverseSentence reverseSentence = new ReverseSentence();
        String s = reverseSentence.ReverseSentence("I am a student.");
        System.out.println(s);
    }
}
