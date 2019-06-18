package JianZhiOffer;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/6/17/017 20:43
 * @Description:将一个字符串中的每个空格替换成“%20”
 */
public class T2ReplaceBlank {
    public String replaceSpace(StringBuffer str) {
        String s=str.toString();
        s=s.replaceAll("\\s","%20");
        return s;
    }
}
