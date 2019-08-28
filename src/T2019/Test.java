package T2019;

import java.util.HashMap;

/**
 * @Auther: zhangfanglong
 * @Date: 2019/8/25/025 19:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        byte s1=127; s1=(byte)(s1 +1);
        short s2 =1; s2+=1;
        System.out.println(s1+" "+s2);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,2);
        map.put(1,3);
        System.out.println(map.get(1));
    }

}
